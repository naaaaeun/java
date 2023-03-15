package ws0302;


public class App {

	public static void main(String[] args) {
		int sum=0;
		int cnt=0;
		//1
		Account[] acc=new Account[6];
		acc[0]=new Account("james1", 10000, 0.35, "VIP");
		acc[1]=new Account("james2", 10000, 0.45, "GOLD");
		acc[2]=new Account("james3", 10000, 0.55, "SIVER");
		acc[3]=new Account("james4", 10000, 0.15, "GOLD");
		acc[4]=new Account("james5", 10000, 0.28, "SIVER");
		acc[5]=new Account("james6", 10000, 0.31, "VIP");
		//2
		for(Account a:acc) {
			System.out.println(a);
		}
		//3
		for(Account a:acc) {
			System.out.printf("%.0f",a.getInterest());
		}
		//4
		for(Account a:acc) {
			if(a.getGrade().equals("VIP")) {
				sum+=a.getBalance();
				cnt++;
			}
		}
		System.out.printf("\nsum = %d avg = %.0f", sum, (sum*1.0)/cnt);
	}

}
