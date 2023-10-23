package dropDownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionsMethods {
	public static void main(String[] args) {
		//launch browser
	WebDriver driver=new ChromeDriver();
	//maximize browser
	driver.manage().window().maximize();
	//apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch web application
	driver.navigate().to("http://demoapps.qspiders.com/");
	//verify the dropdown button
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'duration-150 w-5/12')]"));
	//driver.findElement(By.xpath("//option[text()='+92']")).click();
	//create object for select class
	Select ele = new Select(dropdown1);
	ele.selectByIndex(3);
	WebElement dropdown2 = driver.findElement(By.xpath("//option[text()='Select country']"));
	Select ele2 = new Select(dropdown2);
	ele2.selectByValue("India");
	driver.navigate().to("file:///C:/Users/Pagey/Desktop/htmlBasics/MultiselectDropdown.html");
	WebElement dropdown4 = driver.findElement(By.id("idddd"));
	Select ele4 = new Select(dropdown4);
	//ele4.selectByIndex(5);
	//select multiple options from multiselect dropdown
	for(int i=0;i<=5;i++) {
		ele4.selectByIndex(i);	
	}
	
	//driver.navigate().to("http://demoapps.qspiders.com/");
	//driver.findElement(By.xpath(""))
	
	}
	

}
