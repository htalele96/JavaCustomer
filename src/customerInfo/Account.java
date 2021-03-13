package customerInfo;

public class Account {

	
	private int accountId;
	private int accountBalance;
	SavingAccount savingaccount;
	FixedDesposite fixedDesposite;
	public Account()
	{
		
	}
	
	public void setSavingAccount(SavingAccount savingaccount) {
		this.savingaccount=savingaccount;
	}
	
	public SavingAccount getSavingAccount()
	{
		return this.savingaccount;
	}
	
	
	public void setFixedDesposite(FixedDesposite fixedDesposite) {
		this.fixedDesposite=fixedDesposite;
	}
	
	public FixedDesposite getFixedDesposite()
	{
		return this.fixedDesposite;
	}
	public void setAccountId(int accountId) {
		this.accountId=accountId;	
	}
	
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public int getAccountId() {
		return this.accountId;
	}
	public int getAccountBalance() {
		return this.accountBalance;
	}
}
