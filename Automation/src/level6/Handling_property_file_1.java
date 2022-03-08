package level6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Handling_property_file_1 {
	
	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("./data/commondata.property");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}
}
