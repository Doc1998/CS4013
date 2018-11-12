import java.util.*;
import java.time.LocalDate;
public class BankAccount 
{
	private int id;
	private double balance;
	private String x,name,description;
	private static double annualInterestRate;
	private LocalDate dateCreated = LocalDate.now();
	protected  ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	
	public BankAccount(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	public BankAccount(String name,int id,double balance) {
		this.id = id;
		this.balance = balance;
		this.name  = name;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double amount)
	{
	   annualInterestRate = amount;
	}
	public LocalDate getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
		public void withdraw(double amount,String description) {
			balance = balance - amount;
			this.description = description;
		transactions.add(new Transaction('W',amount,balance,description));
		
		
		}
	public void deposit(double amount,String description) {
		balance = balance + amount;
		this.description = description;
		 transactions.add(new Transaction('D',amount,balance,description));
		
		
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double amount)
	{
		balance = amount;	
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		x = "";
		return (x+ "Name: "+ getName() + " Balance; " + getBalance() + ", id: " + getId() + ", Date Created: " + getDateCreated());
		
	}
}