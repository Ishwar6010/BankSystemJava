package BankAccountApp;

import java.util.List;
public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking checkacc1 = new Checking("Ishwar","123456789",1500);
		Savings savingacc1 = new Savings("Gupta","987654321",2500);
		checkacc1.showInfo();
		System.out.println("*********");
		savingacc1.showInfo();
		
		savingacc1.showBalance();
		checkacc1.transact("Broker", 1000);
		//read csv file then create new accounts based on that data
		
	}

}
