import java.util.*;
public class SavingsAccount extends BankAccount {
public void withdraw (double amount) {
if(getBalance() < amount){
System.out.println("error");
} else{
setBalance(getBalance() - amount);
}
}
public SavingsAccount(int id,double balance)
{
	super(id,balance);
}
public SavingsAccount(String name,int id,double balance)
{
	super(name,id,balance);
}
public String toString()
	{
		return super.toString();
		
	}
}


