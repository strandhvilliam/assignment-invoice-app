import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileInvoiceRepository implements InvoiceRepository {

	private File file = new File("invoices.ser");

	@Override
	public void add(Invoice invoice) {
		List<Invoice> list = deserialize();
		list.add(invoice);
		serialize(list);
	}

	@Override
	public void update(Invoice invoice) {
		List<Invoice> list = deserialize();
		list.stream()
				.filter(listIn -> listIn.getNumber() == invoice.getNumber())
				.findFirst()
				.get()
				.setPaid();

		serialize(list);
	}

	@Override
	public List<Invoice> readAll() {
		return deserialize();
	}

	@Override
	public List<Invoice> readOverdue() {

		return readAll().stream()
				.filter((invoice) -> invoice instanceof RegularInvoice)
				.filter((invoice -> ((RegularInvoice) invoice).getDueDate().isBefore(LocalDate.now())))
				.toList();
	}

	private void serialize(List<Invoice> list) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private List<Invoice> deserialize() {
		List<Invoice> list = new ArrayList<>();

		if (file.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
				list = (List<Invoice>) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}