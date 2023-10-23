package dropDownHandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://demoapps.qspiders.com/");
	//multiselect dropdown
	//driver.findElement(By.partialLinkText("Multi Select")).click();
	//WebElement cityDropdown = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
	driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/MultiselectDropdown.html");
	//multiselect dropdown
	WebElement menudropdown = driver.findElement(By.id("idddd"));
	Select sel = new Select(menudropdown);
	for(int i=0;i<4;i++) {
		Thread.sleep(2000);
		sel.selectByIndex(i);
	}
	//read only the selected options from menu
	List<WebElement> allOption = sel.getAllSelectedOptions();
	//read the list by logic
	for(int i=0;i<=allOption.size();i++) {
		String option = allOption.get(i).getText();
		System.out.println(option);
	}
	//read the list by usin for each loop
	for(WebElement opt:allOption) {
		String op = opt.getText();
		System.out.println(op);
	}
	}

}
