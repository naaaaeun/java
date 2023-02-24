package ifctr;

public class P87 {

	public static void main(String[] args) {
		String grade="";
		int score=20;
		
		if(score>=90) {
			grade="VIP";
		}else if(score>=80) {
			grade="GOLD";
		}else if(score>=70) {
			grade="SILVER";
		}else if(score>=60) {
			grade="BRONZE";
		}else {
			grade="normal";
		}
		System.out.println(grade);
		System.out.println("end..");
	}

}
