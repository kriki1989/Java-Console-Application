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
public class BankAccounts{

	//Instance variables
	private String accNo;
	private Double balance;
	private String cusName;
	private String email;
	private String phoneNo;

	//Constructors
	public BankAccounts(String accNo, double balance, String cusName, String email, String phoneNo){
		this.accNo = accNo;
		this.balance = balance;
		this.cusName = cusName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	//Methods
	public String getAccNo(){
		return this.accNo;
	}

	public Double getBalance(){
		return this.balance;
	}

	public String getCusName(){
		return this.cusName;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPhoneNo(){
		return this.phoneNo;
	}

	public void setAccNo(String accNo){
		this.accNo = accNo;
	}

	public void setBalance(Double balance){
		this.balance = balance;
	}

	public void setCusName(String cusName){
		this.cusName = cusName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}

	//Deposit funds method
	public void depositFunds(double depFun){
		System.out.println ("Your balance was "+this.balance+". Now it is " +(this.balance+depFun) +" E.");
		this.balance+=depFun;
	}

	//Withdraw funds method
	public void withdrawFunds (double withFun){
		System.out.println ("Your balance is "+this.balance+"E.");
		if (this.balance<withFun){
			System.out.println ("You cannot withdrew that amount. Your balance is still "+this.balance+" E.");
		}else{
			this.balance-=withFun;
			System.out.println ("You successfully withdraw that amount. Now your balance is " + this.balance + " E.");
		}
	}
}