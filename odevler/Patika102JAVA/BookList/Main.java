package inputStreamPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args){
		
		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("Lord of The Flies",262,"William Golding",1954));
		bookList.add(new Book("The Giver",167,"Lois Lowry",1993));
		bookList.add(new Book("Oliver Twist",373,"Charles Dickens",1837));
		bookList.add(new Book("The Thief Lord",345,"Cornelia Funke",2000));
		bookList.add(new Book("White Fang",298,"Jack London",1906));
		bookList.add(new Book("Bleak House",912,"Charles Dickens",1852));
		bookList.add(new Book("David Copperfield",624,"Charles Dickens",1849));
		bookList.add(new Book("Leo The African",308,"Amin Maalouf",1986));
		bookList.add(new Book("Samarcande",317,"Amin Maalouf",1988));
		bookList.add(new Book("Balthasar's Odyssey",409,"Amin Maalouf",2002));
		
		Map<String,String> mapBook = new HashMap<>();
		
		bookList.stream().forEach(i -> mapBook.put(i.getBookName(), i.getAuthorName()));
		System.out.println(mapBook);
		
		ArrayList<Book> newBookList = new ArrayList<>();
		
		bookList.stream().filter(b -> b.getPageNumber() > 100).forEach(b -> newBookList.add(b));
		System.out.println(newBookList);
	}

}
