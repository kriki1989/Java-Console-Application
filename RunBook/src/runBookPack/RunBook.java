package runBookPack;

import bookAuthorPack.Author;
import bookAuthorPack.Book;

public class RunBook{

	public static void main(String[] args){
		//constructors
		Author author = new Author ("maria","kati@akati.gr","F");
		Book book = new Book ("10 magisses", author, 15.99, 100);

		//ektupwsh keimenwn apo ta antikeimena mas
		System.out.println (book); //book.toString() is the same thing.

		Author auth1 = new Author ("Talented one");
		Book book1 = new Book ("Flower of the desert", auth1, 20.5, 100);
		Book book2 = new Book ("Harry Potter", auth1, 10, 20);
		Book book3 = book1;
		book3.setAuthorName ("Ioulios Vern");
		//Book book4 = new Book (); **It is wrong to create an object that contains another object without giving an error**

		System.out.println (book1); //book1.toString() is the same thing.
		System.out.println (book2); //book2.toString() is the same thing.
		System.out.println (book3); //book3.toString() is the same thing.
		//System.out.println (book4); **Null Exception**

	}
}