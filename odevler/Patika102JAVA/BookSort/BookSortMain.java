package BookSort;
import java.util.TreeSet;

public class BookSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> sortByBookName = new TreeSet<>(new BookNameComparator());
		TreeSet<Book> sortByPageNumber = new TreeSet<>(new PageNumberComparator());
		
		sortByBookName.add(new Book("Lord of The Flies",262,"William Golding",1954));
		sortByBookName.add(new Book("The Giver",167,"Lois Lowry",1993));
		sortByBookName.add(new Book("Oliver Twist",373,"Charles Dickens",1837));
		sortByBookName.add(new Book("The Thief Lord",345,"Cornelia Funke",2000));
		sortByBookName.add(new Book("White Fang",298,"Jack London",1906));
		
		sortByPageNumber.addAll(sortByBookName);
		
		for(Book book: sortByBookName) {
			System.out.println("Book Name: " + book.getBookName() + 
					", Author Name: " + book.getAuthorName() + 
					", Page Number: " + book.getPageNumber() + 
					", Release Date: " + book.getReleaseDate());
		}
		
		System.out.println("");
		System.out.println("##################################################################################");
		System.out.println("");
		
		for(Book book: sortByPageNumber) {
			System.out.println("Book Name: " + book.getBookName() + 
					", Author Name: " + book.getAuthorName() + 
					", Page Number: " + book.getPageNumber() + 
					", Release Date: " + book.getReleaseDate());
		}
	}

}
