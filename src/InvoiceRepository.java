import java.util.List;

public interface InvoiceRepository {

	void add(Invoice invoice);
	void update(Invoice invoice);
	List<Invoice> readAll();
	List<Invoice> readOverdue();

}