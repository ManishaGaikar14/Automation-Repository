package listenersPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(CustomeListener.class)

public class HomePageActiTime extends BaseTest{
	static WebDriver driver;
	@Test
	public void homePage(){
		String ExpectedLoginTitle="actiTIME - Login";
		Assert.assertEquals(driver.getTitle(),ExpectedLoginTitle);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']/following-sibling::img")).click();
	}
}
