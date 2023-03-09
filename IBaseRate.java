package BankAccountApp;

public interface IBaseRate {
	//method to return base rate
	default double getBaseRate()
	{
		return 6.5;
	}
}
