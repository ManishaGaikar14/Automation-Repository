package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://127.0.0.1:81/login.do;jsessionid=c2fg57948b19j");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();
		//driver.findElement(By.cssSelector("span[class=\"bottomBorder\"]")).click();
		
	}

}
