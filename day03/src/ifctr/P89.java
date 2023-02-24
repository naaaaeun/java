package ifctr;

public class P89 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		grade = (gender.equals("M")) ? 
				((sum >= 90) ? "MVIP" : ((sum >= 80) ? "MGOLD" : "MNORMAL")) : 
				((sum >= 90) ? "FVIP" : ((sum >= 80) ? "FGOLD" : "FNORMAL"));

		switch (grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
		case "FGOLD":
		case "MGOLD":
			sum += 90;
		default:
			sum += 10;
		}

		System.out.println("start..");
		if (grade.equals("MVP")) {
			System.out.println("MVP 혜택..");
			// return;
		}

		System.out.printf("%s,%s,%.2f\n", grade, gender, sum);

		System.out.println("end..");
	}

}
