public class Library {
	private Book[] books;
	
	public Library(Book[] books) {
		super();
		this.books = books;
	}

	public Book[] getBooks() {
		return books;
	}

	public void printAvailableBooks() {
		for (int i=0;i<books.length;i++) {
			if (books[i].isAvailable()) {
				System.out.println(books[i]);
			}

		}
	}

	public void printBookDetails(String title) {
		boolean checkExists = false;
		for (int i=0;i<books.length;i++) {
			if (books[i].getTitle().equals(title)) {
				System.out.println(books[i].toString());
				checkExists = true;
			}
		}
		if (checkExists == false)
			System.out.println("Book with this title does not exist!!!!");

	}

	public void printBooksFromAuthor (String name) {
		for (int i=0;i<books.length;i++) {
			if (books[i].hasAuthor(name)) {
				System.out.println(books[i]);
			}
		}

	}

	public void printTheMostPopularBook () {
		int max=0;
		Book maxBook = books[0];
		for (int i=0;i<books.length;i++) {
			if (books[i].getTimesRented()>max) {
				max = books [i].getTimesRented();
				maxBook = books[i];
			}
		}
		System.out.println(maxBook.toString());
	}
}

