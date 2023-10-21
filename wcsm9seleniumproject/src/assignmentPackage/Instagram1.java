package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.navigate().to("https://www.instagram.com/?hl=en");
	driver.get("https://www.instagram.com/?hl=en");
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("abcd123");
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("pass@123");
	driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'emailOrPhone')]")).sendKeys("9876543214");
	driver.findElement(By.xpath("//input[contains(@name,'fullName')]")).sendKeys("pooja masbjhd nbmnab");
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("puja123");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("pass@123");
	
	}
}
