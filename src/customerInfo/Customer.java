package customerInfo;

public class Customer {

	int custId;
	String name;
	Account account;
	
	private static int counter;
	
	public Customer(int custId,String name) {
		this.custId=custId;
		this.name=name;
		counter++;
		
	}
	
	public void setCustID(int custId) {
		this.custId=custId;
	}
	
	public void setName(String  name) {
		this.name=name;
	}
	
	public void setAccount(Account account) {
		this.account=account;
	}
	
		
	public Account getAccount()
	{
		return this.account;
	}
		
	public int getCustId()
	{
		return this.custId;
	}
	
	public static int getCounter()
	{
		return counter;
	}
	
	
	public String getName()
	{
		return this.name;
	}
}
