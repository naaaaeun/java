package bank;

public class Account {
	private String accNo;
	private double balance;
	public Account() {
		this.accNo =MakeAccountNumber.makeAccNum();
	}
	public Account(double balance) throws Exception {
		this();
		if(balance<0) {
			throw new Exception("er0001");
		}
		this.balance = balance;
	}
	public Account(String accNo, double balance) throws Exception {
		if(balance<0) {
			throw new Exception("er0002");
		}
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	public void withdraw(double money) throws java.lang.Exception {
		if(money <=0) {
			throw new Exception("er0003");
		}
		if(balance-money<0) {
			throw new Exception("er잔액부족");
		}
		balance-=money;
	}
	
	
	
	
	private Exception Exception(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
}
