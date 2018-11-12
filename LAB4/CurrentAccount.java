import java.util.*;
public class CurrentAccount extends BankAccount{
	private double overdraftAmount;
	
		public CreateAccount(int id,double balance,double overdraftAmount) {
		super(id,balance);
		this.overdraftAmount = overdraftAmount;
	}

public void withdraw(double amount) {
		if ((getBalance() < amount) && ( amount - getBalance() > overdraftAmount))
		{
			System.out.println("Error");
		}else
		{
			setBalance(getBalance()-amount);
		}
		
	}
	public String toString()
	{
		return (super.toString() + "\n" +"Overdraft lim: " + overdraftAmount);
		
	}

}
