package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch browser
		driver.get("https://www.bluestone.com/jewellery/lakshmigoldcoins.html");
		//to get address of the current/parent window
		String ParentAddress = driver.getWindowHandle();
		System.out.println(ParentAddress);
		//close browser
		driver.close();
	}

}
