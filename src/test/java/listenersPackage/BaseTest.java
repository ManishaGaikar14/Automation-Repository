package listenersPackage;

import com.google.common.io.Files;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	static WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1:81/login.do");
  }
  //to take screenshot of failed test case
  public void failedsSMethod(String FailedMethodName) {
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File desc = new File("./ScreenShots/"+FailedMethodName+".png");
	 try{
		 Files.copy(src, desc);
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
  }
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
