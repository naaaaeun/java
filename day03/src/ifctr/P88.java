package ifctr;

public class P88 {

	public static void main(String[] args) {
		String grade="";
		int score=20;
		
		if(score>=95||90>=score&&score>=85)  {
			grade="VIP";
		}else if(80>=score&&score>=75||(65>=score&&score>=60)) {
			grade="gold";
		}else {
			grade="normal";
		}
		System.out.println(grade);
	}

}
