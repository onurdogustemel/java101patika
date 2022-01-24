package inputStreamPackage;

public class Book {
	
	private String bookName;
	private int pageNumber;
	private String authorName;
	private int publishYear;
	
	public Book(String bookName,int pageNumber,String authorName,int publishYear) {
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.publishYear = publishYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public String toString() {
		return "Book Name: " + this.getBookName() + 
				"\tPage Number: " + this.getPageNumber() + 
				"\tAuthor Name: " + this.getAuthorName() + 
				"\tPublish Year: " + this.getPublishYear();
	}

}
