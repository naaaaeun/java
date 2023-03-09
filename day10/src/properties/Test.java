package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in= null;
		try {
			in = new FileInputStream(fileName);//file input stream api로 읽어오기
			props.load(in); // properties에 담기
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in !=null) {				
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String ip = props.getProperty("IP_ADDR");//담은 파일 내용 읽어오기
		System.out.println(ip);
	}
}
