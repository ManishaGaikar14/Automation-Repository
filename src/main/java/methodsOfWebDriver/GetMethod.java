package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize browser
	driver.manage().window().maximize();
	//launch browser using get method
	driver.get("https://www.flipkart.com/");
	//close browser
	driver.close();
}
}
