package customerInfo;

public class SavingAccount {

	private int savingAccountId;
	private int savingAccountNumber;
	
	
	public SavingAccount()
	{
		
	}
	
	public void setsavingAccountId(int savingAccountId) {
		this.savingAccountId=savingAccountId;	
	}
	
	public void setSavingAccountNumber(int savingAccountNumber) {
		this.savingAccountNumber = savingAccountNumber;
	}
	
	public int getSavingAccountId() {
		return this.savingAccountId;
	}
	public int getSavingAccountNumber() {
		return this.savingAccountNumber;
	}
}

