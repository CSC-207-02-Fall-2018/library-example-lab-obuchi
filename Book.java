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
	/**
	 * returns the author
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * returns the ISBN number
	 * @return isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * returns the title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * sets the name of the author to the given name
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * sets the ISBN number to the given ISBN number
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * sets title to the given title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\n";
	}

}
