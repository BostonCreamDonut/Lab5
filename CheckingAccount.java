public class CheckingAccount extends BankAccount
{
	private double FEE= -.15;
	private String extension="-10";
	CheckingAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + extension);
	}
	public boolean withdraw(double amount)
	{
		boolean check=true;
		double x=(super.getBalance()-amount+FEE);
		if(amount+ FEE <= super.getBalance())
		{
			super.setBalance(x);
		}
		else
		{
			check=false;
		}
		return check;
	}
}
