package actionsPackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[text()=\"Settings\"]/ancestor::a[@class=\"content administration\"]/descendant::span[@class=\"bottomBorder\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Logo & Color")).click();
		//dropdown
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.name("colorScheme"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(4);
	}
}
