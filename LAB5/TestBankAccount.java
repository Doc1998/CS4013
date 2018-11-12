import java.util.*;
public class TestBankAccount 
{ public static ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	public static void main (String [] args)
	{
		BankAccount.setAnnualInterestRate(4.5);
		accountList.add(new SavingsAccount("Bob",1212,703));
		accountList.add( new SavingsAccount("Tom",1000,10230.78));
		accountList.add(new CurrentAccount("Tim",1001,10002,3000));
		accountList.add(new CurrentAccount("Mike",1002,45678.32,700));
		accountList.get(0).deposit(1000,"deposit");
		accountList.get(0).withdraw(398,"Withdraw");
		accountList.get(1).deposit(1000,"deposit");
		accountList.get(1).withdraw(398,"Withdraw");
		accountList.get(2).deposit(1000,"deposit");
		accountList.get(2).withdraw(398,"Withdraw");
		accountList.get(3).deposit(1000,"deposit");
		accountList.get(3).withdraw(2348.99,"Withdraw");
		for(int i = 0;i<accountList.size();i++)
		{
			System.out.println("Bank account: " + accountList.get(i).toString());
			for(int k = 0;k<accountList.get(i).transactions.size();k++)
			{
				System.out.println(accountList.get(i).transactions.get(k).toString() + "\n");
			}
		}
		
		
		
		
	}
}