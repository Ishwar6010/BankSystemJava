package BankAccountApp;
//will not create objects from this class so it will 
public abstract class Account implements IBaseRate{
	//list common properties for checking and savings account
	String name;
	String ssn;
	double balance;
	String accountHolder;
	double rate;
	String accountNumber;
	static int index = 10000;
	
	//constructor to set base properties and initialize account
	public Account(String name,String ssn,double deposit) {
		this.name = name;
		this.ssn = ssn;
		balance = deposit;
		index++;
		this.accountNumber = setAccountNumber();	
	}
	public abstract void setRate();
	//Set Account Number
	private String setAccountNumber() {
		String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()*Math.pow(10,3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	//common methods
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Amount Deposited : "+amount);
		showBalance();
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.println("Amount Withdrawn : "+amount);
		showBalance();
	}
	public void transact(String toWhere,double amount)
	{
		balance = balance - amount;
		System.out.println("Transferring "+amount+" to "+toWhere);
		showBalance();
	}
	public void showBalance()
	{
		System.out.println("Balance Remaining :"+balance);
	}
	//show info
	public void showInfo()
	{
		System.out.println("Name : "+name + "\nAccount Number : "+accountNumber + "\nBalance : "+balance);
	}
	
	

}
