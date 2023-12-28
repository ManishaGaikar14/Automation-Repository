package keywordDriverFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{
	static WebDriver driver;
	//method to launch browser and web application
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readDataFromProperty("./src/main/resources/config.properties","Browser");
		String url = flib.readDataFromProperty("./src/main/resources/config.properties","Url");
		if(browserValue.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("Chrome")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Browser Value Is Invalid");
		}
		//maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch web application
		driver.get(url);
	}
	
	//method to close browser
	public void closeBrowser() {
		driver.quit();
	}

}
