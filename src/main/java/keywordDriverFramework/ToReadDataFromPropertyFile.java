package keywordDriverFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty("Browser");
	System.out.println(data);
	String data1 = prop.getProperty("Url");
	System.out.println(data1);
	}
}
