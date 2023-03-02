package ws0302;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;

	public Account() {
		accNum = MakeAccountNumber.makeAccountNum();
	}

	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}

	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("출금 금액을 확인하세요");
			return;
		}
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= money;
		System.out.printf("balance:%.0f\n", balance);
	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금 금액을 확인하세요");
			return;
		}
		balance = +money;
		System.out.printf("balance:%.0f\n", balance);
	}

	public double getInterest() {
		double result = balance * rate;
		System.out.printf("\n잔액: %.0f 이자금액: ", balance);
		this.balance += balance * rate;
		return result;
	}

	public String getGrade() {
		return grade;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}

}
