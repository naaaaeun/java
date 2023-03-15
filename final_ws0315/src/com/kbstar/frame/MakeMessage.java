package com.kbstar.frame;

public class MakeMessage {

	public static String makeMessage(String code) {
		String result="";
		switch(code) {
		case "er0001":result="이미 있는 번호입니다..";break;
		case "er0002":result="없는 번호이므로 삭제할 수 없습니다..";break;
		case "er0003":result="없는 번호이므로 수정할 수 없습니다..";break;
		case "er0004":result="이미 있는 id입니다..";break;
		case "er0005":result="없는 id이므로 삭제할 수 없습니다..";break;
		case "er0006":result="없는 id이므로 수정할 수 없습니다..";break;
		default:result="고객센터에 문의 하세요";
		}
		return result;
	}

}
