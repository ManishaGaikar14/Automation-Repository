package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize Browser
		driver.manage().window().maximize();
		//launch web Application
		driver.get("https://www.bluestone.com/jewellery/lakshmigoldcoins.html");
		//to get the source code of the page
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		//close browser
		driver.close();
	}

}
