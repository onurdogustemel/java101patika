package BookSort;
import java.util.Comparator;

public class PageNumberComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book a, Book b) {
		return a.getPageNumber() - b.getPageNumber();
	}
}
