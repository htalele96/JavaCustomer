package customerInfo;

public class FixedDesposite {
	private int fixedDepositeTerm;
	private int fixedDepositeAmount;
	
	
	public FixedDesposite()//empty constructor
	{
		
	}
	
	public void setFixedDepositeTerm(int fixedDepositeTerm) {
		this.fixedDepositeTerm=fixedDepositeTerm;	
	}
	
	public void setFixedDepositeAmount(int fixedDepositeAmount) {
		this.fixedDepositeAmount = fixedDepositeAmount;
	}
	
	public int getFixedDepositeTerm() {
		return this.fixedDepositeTerm;
	}
	public int getFixedDepositeAmount() {
		return this.fixedDepositeAmount;
	}
}
