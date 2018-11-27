import java.text.DecimalFormat;

public class SavingsAccount
{
	private double balance;
	private double interest;
	public SavingsAccount()
	{
		balance = 0;
		interest = 0;

}
	String pattern = "0.00";
	DecimalFormat df = new DecimalFormat(pattern);
	public SavingsAccount(double initialBalance)
	{
		balance = initialBalance;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}