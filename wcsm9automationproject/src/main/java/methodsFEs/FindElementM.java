package methodsFEs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElementM {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Laptop");
	driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[text()='Type']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Laptop']"))).click();
	//driver.findElement(By.xpath("//div[text()='Laptop']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Processor']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='16 GB']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='SSD Capacity']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='512 GB']")).click();
	List<WebElement> Address = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	for(int i=0;i<Address.size();i++) {
		String options = Address.get(i).getText();
		Thread.sleep(2000);
		System.out.println(options);
	}
	}
}
