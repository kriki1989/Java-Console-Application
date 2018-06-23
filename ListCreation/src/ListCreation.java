import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListCreation {

	public static ArrayList<String> ourList = new ArrayList<>();
	public static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		String myWord;
		do {
			prompt();
			myWord = input();
			ourList.add(myWord);
			displayCounter(myWord);
		} while (!myWord.equalsIgnoreCase("exit"));
		input.close();
	}

	public static void prompt() {
		System.out.print("Enter word: ");
		System.out.flush();
	}

	public static String input() {

		String myWord = input.next();
		return myWord;
	}

	public static void displayCounter(String myWord) {
		int count = Collections.frequency(ourList, myWord);
		System.out.println("The word " + myWord + " is in the list " + count + " times.");
	}
}
