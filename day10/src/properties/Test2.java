package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		try(FileInputStream in = new FileInputStream(fileName);) {//file input stream api로 읽어오기
			props.load(in); // properties에 담기
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("문제 발생!");
			return;
		}//try catch 안에서 선언 시 별도 close 필요없음
		String ip = props.getProperty("IP_ADDR");//담은 파일 내용 읽어오기
		int port = Integer.parseInt(props.getProperty("PORT")) ;//담은 파일 내용 읽어오기
		System.out.printf("%s서버로 %d포트 사용해서 접속",ip,port);
	}
}
