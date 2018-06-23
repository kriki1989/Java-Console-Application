/*
Create a new class for a bank account
Create fiels for the 1. account number, 2.balance, 3.customer name, 4.email and 5.phone number

Create getters and setters for each field
Create two additional methods
1. To allow the customer to deposit funds (this should increment the balance field)
2. To allow the customer to withdraw funds. This should deduct from the balance of the field,
but not allow the withdrawal to complete if their are insufficient funds
You will want to create various code in the Main class (the one created by IntelliJ) to
confirm your code is working.
Add some System.out.println's in the two methods above as well.
*/

/*
Press:
1 - To add a new account
2 - To deposit funds to an account
3 - To withdraw funds from an account
4 - To exit the program
*/

import java.util.Scanner;
public class RunBankAccounts{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Input
		String accNo;
		Double balance;
		String cusName;
		String email;
		String phoneNo;
		System.out.println ("Give account number: ");
		accNo = input.nextLine();
		System.out.println ("Give balance: ");
		balance = Double.parseDouble(input.nextLine());
		System.out.println ("Give customer name: ");
		cusName = input.nextLine();
		System.out.println ("Give email: ");
		email = input.nextLine();
		System.out.println ("Give phone number: ");
		phoneNo = input.nextLine();

		double withFun;
		double depFun;
		int choice;

		//Constructors
		BankAccounts bankAcc = new BankAccounts(accNo, balance, cusName, email, phoneNo);

		//User Menu
		do{
			System.out.println ("\nPress: \n1 - To deposit funds to an account \n2 - To withdraw funds from an account \n3 - To exit the program");
			choice = input.nextInt();
			if (choice==1){
				System.out.println ("How much money do you want to deposit to your balance?");
				depFun = input.nextDouble();
				bankAcc.depositFunds(depFun);
			}else if (choice==2){
				System.out.println ("How much money do you want to withdraw from your balance?");
				withFun = input.nextDouble();
				bankAcc.withdrawFunds(withFun);
			}
		}while (choice!=3);

	}
}