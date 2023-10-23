package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod1 {
	public static void main(String[] args) {
		//verify logout link is in home page of actiTime
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.navigate().to("http://127.0.0.1:81/login.do;jsessionid=7k9v0d04es9k");
				
				//identify username and pass text box
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.id("loginButton")).click();
				
				WebElement CheckBoxButton = driver.findElement(By.id("keepLoggedInLabel"));
				boolean status2 = CheckBoxButton.isSelected();
				System.out.println(status2);
				//select the check box verify status
				CheckBoxButton.click();
				boolean status3 = CheckBoxButton.isSelected();
				System.out.println(status3);
				
				//check for logout link elemet is displayed or not
				WebElement status = driver.findElement(By.partialLinkText("Logout"));
				boolean statusOfMethod = status.isSelected();
				System.out.println(statusOfMethod);
	}

}
