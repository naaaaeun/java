package ws0307;


public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	// constructor ->음수 예외 상황
	public Account() {
		this.accNo = MakeAccountNumber.makeAccountNum();
	}

	public Account( String name, String accHolder, double balance) throws NegativeException {
		this();
		this.name = name;
		this.accHolder = accHolder;
		if(balance<0) {
			throw new NegativeException("음수값이 입력되었습니다");
		}
		this.balance = balance;
	}

	// 계좌 정보 조회
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

	// 잔액 조회
	public String getBalance() {
		return "잔액:" + balance;
	}

	// 입금 ->음수 예외 상황
	public String deposit(double m) throws NegativeException {
		if(m<0) {
			throw new NegativeException("음수값이 입력되었습니다");
		}else if(m==0){
			throw new NegativeException("0이 입력되었습니다");
		}
		balance+=m;
		return m+"원 입금 후 잔액:" + balance;
	}

	// 출금 ->잔액 부족 예외 상황, 음수 예외 상황
	public String withdraw(double m) throws NegativeException, InsufficientException {
		if(m<0) {
			throw new NegativeException("음수값이 입력되었습니다");
		}else if(m==0){
			throw new NegativeException("0이 입력되었습니다");
		}
		if((balance-m)<0){
			throw new InsufficientException("잔액이 부족합니다");
		}
		balance-=m;
		return m+"원 출금 후 잔액:" + balance;
	}

}
