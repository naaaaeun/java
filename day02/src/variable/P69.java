package variable;

public class P69 {

	public static void main(String[] args) {
		String str="abcdef";
		str =str.toUpperCase();
		System.out.println(str);
		
		String str2 = str.replace("A", "B");
		System.out.println(str2);
		
		int lng = str.length();
		System.out.println(lng);
		
		int t= str.indexOf('B');
		System.out.println(t);
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String str3 = str.substring(0,3);
		System.out.println(str3);
		
		String email = "naeunlee1223@gmail.com";
		String id=email.substring(0,email.indexOf('@'));
		String domain =email.substring(email.indexOf('@')+1,email.length());
		System.out.println(id + domain);
	}

}
