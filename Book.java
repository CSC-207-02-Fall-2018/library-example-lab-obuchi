package library;

public class Book {
	
	protected String title;
	protected String author;
	protected String isbn;
	
	public Book() {
		title = "";
		author = "";
		isbn = "";
	}
	public Book (String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\n";
	}

}
