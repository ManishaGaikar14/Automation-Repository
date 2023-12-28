package listenersPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(CustomeListener.class)

public class ValidLoginTest extends BaseTest{
  @Test
  public void validLoginMethod() {
	  String expectedLoginTitle="actiTIME - Login";
	  Assert.assertEquals(driver.getTitle(),expectedLoginTitle);
	  //test login page
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click(); 
  }
}

