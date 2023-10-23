package dropDownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstOptionSelectedMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/DropDown.html");
	WebElement dropdown = driver.findElement(By.id("id"));
	Select element = new Select(dropdown);
	String textOfElement = element.getFirstSelectedOption().getText();
	System.out.println(textOfElement);
	//multiselect dropdown
	driver.navigate().to("file:///C:/Users/Pagey/Desktop/htmlBasics/MultiselectDropdown.html");
	WebElement Dropdown2 = driver.findElement(By.id("id"));
	Select element2 = new Select(Dropdown2);
	for(int i=5;i<8;i++) {
		element2.selectByIndex(i);
	}
	WebElement webElement123 = element2.getFirstSelectedOption();
	System.out.println(webElement123);
	}

	
}
