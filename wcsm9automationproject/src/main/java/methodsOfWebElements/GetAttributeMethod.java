package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//get the attribute value of username textbox
	WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
	String attributeValue = usnTB.getAttribute("name");
	System.out.println(attributeValue);
	
	//get the css properties of username textbox
	String CssValue = usnTB.getCssValue("color");
	System.out.println(CssValue);
	
	//get the tagname of the username text box
	String tagName = usnTB.getTagName();
	System.out.println(tagName);
	}

}
