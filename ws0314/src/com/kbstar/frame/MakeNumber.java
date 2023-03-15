package com.kbstar.frame;

import java.util.Calendar;

public class MakeNumber {
	public static int cnt = 100;
	public static int cnt2 = 100;
	public static String makeItemNum() {
		String Num = "";
		Calendar cal = Calendar.getInstance();
		Num = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cal.get(Calendar.MILLISECOND)
		            + cnt2;
		cnt2++;
		return Num;
	}
	public static String makeNum() {
		String Num = "";
		Calendar cal = Calendar.getInstance();
		Num = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cnt;
		cnt++;
		return Num;
	}
}
