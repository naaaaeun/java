package ws0307;

import java.util.Random;

public class MakeAccountNumber {
	public static String makeAccountNum() {
		String accNo = "";
		Random r=new Random();
		accNo = "015601-04-"+(r.nextInt(1000000)+100000); 
		return accNo;
	}
}