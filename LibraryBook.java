package library;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	protected String callNumber;
	
	public LibraryBook (String au, String ti, String num, String callNum) {
		super (au, ti,num);
		callNumber = callNum;
	}
	
	/**
	 * returns the call number
	 * @return callNumber
	 */
	public String getCallNumber () {
		return callNumber;
	}
	
	/**
	 * sets the call number to the given call number
	 * @param callNumber
	 */
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	
	abstract String circulationStatus();
	
	abstract void checkout (String patron, String dueDate);
	
	abstract void returned ();
	
	/** 
	 * compares the given LibraryBook object to the the current LibraryBook object 
	 */
	public int compareTo (LibraryBook lib) {
		if (this.callNumber.equals(lib.getCallNumber()) ) {
			return 0;
		}
		else {
			return this.callNumber.compareTo(lib.getCallNumber());	
		}
	}

	public String toString() {
		return super.toString() + "Call Number: " + callNumber + "\n"; 
	}

}
