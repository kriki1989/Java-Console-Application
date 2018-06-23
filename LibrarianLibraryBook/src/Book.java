public class Book {
	private String title;
	private Author author;
	final private String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;

	public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
		this.title = title;
		this.author=author;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}

	public String getTitle() {
		return this.title;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	

	public int getAvailableCopies() {
		return availableCopies;
	}

	public String toString() {
		return "Book [title=" + title + ", Author=" + author.getName() + ", isbn=" + isbn + ", physicalCopies=" + physicalCopies
				+ ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + "]";
	}

	public boolean isAvailable() {
		if (this.availableCopies>0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean hasAuthor(String name) {
		if (name.equals(author.getName())) {
			return true;
		}else {
			return false;
		}
	}

	public int getTimesRented() {
		return timesRented;
	}


}
