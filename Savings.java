package BankAccountApp;

public class Savings extends Account{
	//list properties for savings  account
	int safetyBoxID;
	int safetyBoxKey;
	//constructor to set base properties and initialize account
	public Savings(String name,String ssn,double deposit)
	{
		super(name,ssn,deposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();	
		setRate();
	}
	@Override
	public void setRate()
	{
		rate = getBaseRate()-0.25;
	}
	private void setSafetyDepositBox()
	{
		safetyBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo()
	{
		System.out.println("Account Type:Savings");
		super.showInfo();
		System.out.println("SafetBoxID : "+safetyBoxID+"\nSafetyBoxKey : "+safetyBoxKey);
		System.out.println("Interest Rate : "+rate+"%");
	}
	//list savings methods
}
