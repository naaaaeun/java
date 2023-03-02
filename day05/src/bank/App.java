package bank;


public class App {

	public static void main(String[] args) {
		Account c =new Account("101010","이말숙",100000);
		System.out.println(c);
		
		c.withdraw(10000);
		System.out.println(c.getBalance());
		
		
	
	
	}

}
