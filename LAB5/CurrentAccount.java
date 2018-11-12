import java.util.*;
public class CurrentAccount extends BankAccount{
	private double overdraftAmount;
	
		public CurrentAccount(int id,double balance,double overdraftAmount) {
		super(id,balance);
		this.overdraftAmount = overdraftAmount;
	}
	
		public CurrentAccount(String name,int id,double balance,double overdraftAmount) {
		super(id,balance);
		this.overdraftAmount = overdraftAmount;
	}

public void withdraw(double amount,String description) {
		if ((getBalance() < amount) && ( amount - getBalance() > overdraftAmount))
		{
			System.out.println("Error");
		}else
		{
			super.withdraw(amount,description);
		}
		
	}
	public String toString()
	{
		return (super.toString() + "\n" +"Overdraft lim: " + overdraftAmount);
		
	}

}
