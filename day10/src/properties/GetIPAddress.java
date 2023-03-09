package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetIPAddress {
	public static String getIPAddress() {
		String ipAddr="";
		Properties props = new Properties();
		String fileName = "file.txt";
		try(FileInputStream in = new FileInputStream(fileName);) {//file input stream api로 읽어오기
			props.load(in); // properties에 담기
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("문제 발생!");
		}//try catch 안에서 선언 시 별도 close 필요없음
		ipAddr = props.getProperty("IP_ADDR");//담은 파일 내용 읽어오기
		return ipAddr;
	}
}
