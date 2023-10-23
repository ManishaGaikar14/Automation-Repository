package methodsFEs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartFindElements {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Laptop");
	driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]")).click();
	//driver.findElement(By.xpath("//div[@class=\"_1YAKP4\"]")).click();
	driver.findElement(By.xpath("//div[text()=\"Brand\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()=\"HP\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@title=\"Core i7\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='32 GB']")).click();
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	Thread.sleep(2000);
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='4★ & above']"))).click();
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(2000);
	List<WebElement> allLaptop = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	System.out.println(allLaptop);
	List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]/ancestor::div[2]"));
	for(int i=0;i<=allLaptop.size();i++){
		String laptop=allLaptop.get(i).getText();
		Thread.sleep(2000);
	for(int j=i;j<=i;j++) {
		String Price = allPrice.get(j).getText();
		Thread.sleep(2000);
		System.out.println(laptop+" "+Price);
	}
	}
	}

}
