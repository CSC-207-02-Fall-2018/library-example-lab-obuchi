package library;

public class CirculatingBook extends LibraryBook {
	protected String currentHolder;
	protected String dueDate;
	
	public CirculatingBook (String author, String title, String isbn, String callNumber) {
		super(author, title, isbn, callNumber);
		currentHolder = "";
		dueDate = "";
	}
	
	/** 
	 * returns the circulation status of a book
	 */
	public String circulationStatus() {
		if (currentHolder.equals("")) {
			return "Current Holder: " + currentHolder + "\n Due Date: " + dueDate;
		}
		
		return "book available on shelves";		
	}

	/**
	 * saves the given patron and due date of a book
	 */
	public void checkout(String patron, String dueDate) {
		currentHolder = patron;
		this.dueDate = dueDate;
		
	}

	/**
	 * clears the currentHolder and dueDate of a book
	 */
	public void returned() {
		currentHolder = "";
		dueDate = "";
		System.out.println("This book has been returned");
		
	}
	
	public String toString() {
		if (currentHolder.equals("")) {
			return super.toString();
		}
		return super.toString() + "Current Holder: " + currentHolder + "\nDue Date: " + dueDate + "\n";
	}
	
	public int compareTo(library.LibraryBook lib) {
		return super.compareTo(lib);
	}


}
