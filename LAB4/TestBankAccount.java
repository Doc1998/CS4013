import java.util.*;
public class TestBankAccount 
{ ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	public static void main (String [] args)
	{	double interestRate= 4.5;
		accountList.setAnnualInterestRate(interestRate);
		accountList.add(new SavingsAccount(1212,703));
		accountList.add(new SavingsAccount(1000,10230.78));
		accountList.add(new CurrentAccount(1001,10002,3000));
		accountList.add(new CurrentAccount(1002,45678.32,700));
		accountList.get(0).deposit(1000);
		accountList.get(0).withdraw(398);
		accountList.get(1).deposit(1000);
		accountList.get(1).withdraw(398);
		accountList.get(2).deposit(1000);
		accountList.get(2).withdraw(398);
		accountList.get(3).deposit(1000);
		accountList.get(3).withdraw(2348.99);
		accountList.toString();
		
		
	
		
	}
	/*public String toString(int id)
	{
		 String x ="";
    for (int i=0; i<accountList.size(); i++) {
		if(id.matches(accountList.get(i).get(id))
		{
      x = (x+ "Balance; " + accountList.get(i).getBalance() + ", id: " + accountList.get(i).getId() + ", Date Created: " + accountList.get(i).getDateCreated());
		}else
		{
			System.out.println("ID does not exist");
		}
    
    return x;
	}*/
	
	public String toString()
	{
		 String x ="";
    for (int i=0; i<accountList.size(); i++) {
		
      x = (x+ "Balance; " + accountList.get(i).getBalance() + ", id: " + accountList.get(i).getId() + ", Date Created: " + accountList.get(i).getDateCreated());
		}
    
    return x;
	}
}