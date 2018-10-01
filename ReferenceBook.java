package library;

public class ReferenceBook extends LibraryBook {
	protected String collection;
	
	public ReferenceBook (String author, String title, String isbn, String callNumber, String collection) {
		super (author, title, isbn, callNumber);
		this.collection = collection;
	}

	public void checkout(String patron, String dueDate) {
		System.out.println(patron + " cannot checkout a refrence book \n");
	}
	
	public String getCollection() {
		return collection;
	}
	
	public void returned() {
		System.out.println("reference book could not have been checked out -- return impossible");
	}
	
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	public String circulationStatus() {
		return "non-circulating reference book";
	}
	
	public String toString() {
		return super.toString() + "Collection: " + collection + "\n";
	}
	
	public int compareTo(library.LibraryBook lib) {
		return super.compareTo(lib);
	}


}
