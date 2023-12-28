package testNGAnnotation_Flag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFlag {
	
		@Test(dataProvider ="testData")
	  public void InvalidLogin(String usn,String pass) {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("http://127.0.0.1:81/login.do");
		  driver.findElement(By.name("username")).sendKeys(usn);
		  driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButton")).click();
		  driver.findElement(By.name("username")).clear();
		  driver.close();
	  }
	@DataProvider(name="testData")
	  @Test
	  public Object[][] actiTimeDatatMethod() {
		
		  Object[][] testData=new Object[5][2];
		  testData[0][0]="ad_min";
		  testData[0][1]="man_ger";
		  testData[1][0]="admi123";
		  testData[1][1]="man123";
		  testData[2][0]="1234adm";
		  testData[2][1]="432mana";
		  testData[3][0]="mana123";
		  testData[3][1]="ad213min";
		  testData[4][0]="manager";
		  testData[4][1]="admij";
		  return testData;
	  }
}
