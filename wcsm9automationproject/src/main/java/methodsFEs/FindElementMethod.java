package methodsFEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	driver.switchTo().activeElement().sendKeys("bike");
	Thread.sleep(2000);
	//identify all the suggestions of bike
	List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]"));
	//read add the suggestions of bike using for loop
	Thread.sleep(2000);
	for(int i=0;i<bikeOptions.size();i++) {
		String options = bikeOptions.get(i).getText();
		Thread.sleep(2000);
		System.out.println(options);
	}
	
	//for(WebElement op:bikeOptions) {
		//String options=op.getText();
		//System.out.println(options);
		//}
	}

}
