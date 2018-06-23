public class Librarian {

	private Library library;

	public Librarian(Library library) {
		super();
		this.library = library;
	}

	public void findMeBooksFromAuthor(String name) {
		this.library.printBooksFromAuthor(name);
	}

	public void findMeAvailableBooks() {
		this.library.printAvailableBooks();
	}

	public void findMeBook (String title){
		this.library.printBookDetails(title);
	}

	public void findMostPopularBook() {
		this.library.printTheMostPopularBook();
	}

	public boolean rentBook(String title) {
		for (int i=0;i<this.library.getBooks().length;i++) {
			if (this.library.getBooks()[i].getTitle().equals(title)) {
				if (this.library.getBooks()[i].isAvailable()) {
					this.library.getBooks()[i].setAvailableCopies(this.library.getBooks()[i].getAvailableCopies() - 1);
					return true;
				}
			}
		}
		return false;
	}

}
