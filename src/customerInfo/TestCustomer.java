package customerInfo;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cust=new Customer(5,"Sanket");
		
		//cust.setName(str);
		
		int customerId=cust.getCustId();
		System.out.println(customerId);
		System.out.println(cust.getName());
		System.out.println(Customer.getCounter());
	
		Account account1 = new Account();
		account1.setAccountBalance(256);
		account1.setAccountId(5);
		
		cust.setAccount(account1);
		
		 SavingAccount savingAccount=new SavingAccount();
		 savingAccount.setsavingAccountId(34);
		 savingAccount.setSavingAccountNumber(56);
		account1.setSavingAccount(savingAccount);
		
		FixedDesposite fixedDeposite=new FixedDesposite();
		fixedDeposite.setFixedDepositeAmount(2);
		fixedDeposite.setFixedDepositeAmount(9000);
		account1.setFixedDesposite(fixedDeposite);
		
		 System.out.println(cust.getAccount().getAccountBalance());
		 
		 System.out.println(cust.getAccount().getAccountId());
		 System.out.println(cust.getAccount().getSavingAccount().getSavingAccountNumber());
		 System.out.println(cust.getAccount().getSavingAccount().getSavingAccountId());
		 System.out.println(cust.getAccount().getFixedDesposite().getFixedDepositeAmount());
		
	}

}
