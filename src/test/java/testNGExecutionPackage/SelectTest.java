package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectTest {
	static WebDriver driver;
  @Parameters({"Browser","Url","Username","Password"})
  @Test
  public void selectTest(String browserValue,String Url,String Username,String Password) throws InterruptedException {
	  
	  if(browserValue.equalsIgnoreCase("Chrome")) {
		  driver= new ChromeDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("FireFox")) {
		  driver= new FirefoxDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("Edge")) {
		  driver= new EdgeDriver();
	  }
	  else {
		  Reporter.log("Enter Valid Browser Value!!!",true);
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(Url);
	  driver.findElement(By.name("username")).sendKeys(Username);
	  driver.findElement(By.name("pwd")).sendKeys(Password);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  driver.quit();
  }
}
