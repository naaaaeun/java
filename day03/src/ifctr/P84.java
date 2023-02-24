package ifctr;

public class P84 {

	public static void main(String[] args) {
		String grade="";
		String gender="";
		double sum =80.0;
		
		if(gender.equals("M")) {
			System.out.println("male..");
			if(sum>=90) {
				grade="MVIP";
			}else if(sum>=80) {
				grade="MGOLD";
			}else{
				grade="MNORMAL";
			}
		}else if(gender.equals("F")) {
			System.out.println("female..");
			if(sum>=90) {
				grade="FVIP";
			}else if(sum>=80) {
				grade="FGOLD";
			}else{
				grade="FNORMAL";
			}
		}
		
		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum+=100;
		case "FGOLD":
		case "MGOLD":
			sum+=90;
		default:
			sum+=10;
		} //이런 경우 if문보다 간단해짐!

		
		System.out.println("start..");
		if(grade.equals("MVP")) {
			System.out.println("MVP 혜택..");
			//return;
		}
		
		
		System.out.printf("%s,%s,%.2f\n",grade,gender,sum );
		
		
		System.out.println("end..");
	}

}
