package ifctr;

public class P86 {

	public static void main(String[] args) {
		String grade="";
		String gender="M";
		double sum =80.0;
		
		if(gender.equals("M")) {
			System.out.println("male..");
		}else {
			System.out.println("female..");
		}
		
		
		if(sum>=90.0) {
			grade="VIP";
		}else if(sum>=70.0) {
			grade="GOLD";
		} else {
			grade="PREMIUM";
		}
		
		
		System.out.println("start..");
		if(grade.equals("MVP")) {
			System.out.println("MVP 혜택..");
			//return;
		}
		
		
		System.out.printf("%s,%s,%.2f\n",grade , gender,sum );
		
		
		System.out.println("end..");
	}

}
