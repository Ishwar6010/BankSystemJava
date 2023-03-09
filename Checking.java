package BankAccountApp;

public class Checking extends Account{
	//list properties for checking  account
	int debitCardNo;
	int debitCardPIN;
		//constructor to set base properties and initialize account
	public Checking(String name,String ssn,double deposit)
	{
		//we need this super to call our parent constructor
		super(name,ssn,deposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		setRate();
	}
	@Override
	public void setRate()
	{
		rate = getBaseRate()*0.15;
	}
	private void setDebitCard()
	{
		debitCardNo = (int)(Math.random()*Math.pow(10, 12));
		debitCardPIN = (int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo()
	{
		System.out.println("Account Type:Checking");
		super.showInfo();
		System.out.println("DebitCardNo : "+debitCardNo+"\nDebitCardPIN : "+debitCardPIN);
		System.out.println("Interest Rate : "+rate+"%");
	}
		//list checking methods
}
