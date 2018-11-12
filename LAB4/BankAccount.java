import java.util.*;
public class BankAccount 
{
	private int id;
	private double balance;
	private static double annualInterestRate;
	private localDate dateCreated = localDate.now();
	
	public BankAccount(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double amount)
	{
	   annualInterestRate = amount;
	}
	public localDate getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
		public void withdraw(double amount) {
			balance = balance - amount;
		}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public double getBalance()
	{
		return balance;
	}
	public double setBalance(double amount)
	{
		balance = amount;	
	}
	public int getId()
	{
		return id;
	}
	public String toString()
	{
		x = "";
		return (x+ "Balance; " + getBalance() + ", id: " + getId() + ", Date Created: " + getDateCreated());
		
	}
}