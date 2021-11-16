public class SavingsAccount extends BankAccount {
	private double rate =.025;
	private int savingsNumber = 0;
	private String accountNumber;
	

	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	//copy constructor
	public SavingsAccount (SavingsAccount oldAccount, int amount)
	{
		super(oldAccount, amount);
		accountNumber =  super.getAccountNumber() + "-" + (savingsNumber +1);
	}
	
	public void postInterest()
	{
		super.setBalance(super.getBalance()+ super.getBalance()* rate);
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
