import java.util.*;
import java.time.*;

public class Transaction 
{   char  type;
	double amount,balance;
	private String x;
    String description;
	private LocalDateTime date = LocalDateTime.now();
	public Transaction(char type,double amount,double balance,String description)
	{
		
			this.type = type;
			this.amount = amount;
			this.balance = balance;
			this.description = description;
			
			
			
		
	}
	public char getType()
	{
		return type;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAmount()
	{
		return amount;
	}
	public String getDescription()
	{
		return description;
	}
	public String toString()
	{
		
		return ("Type: "+ type + " Balance: " + balance + " Amount: " + amount + " Description: " + description + " Date Created: " + date);
		
	}
	
	
}