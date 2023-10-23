package dropDownHandeling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateFromDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/DropDown.html");
		//identify Single SELECT DROPDOWN
		WebElement DropDown = driver.findElement(By.name("singleselect"));
		//get all the options of menudropdown
		Select AllOptions = new Select(DropDown);
		List<WebElement> Result = AllOptions.getOptions();
		System.out.println(Result);
		System.out.println(DropDown.getText());
		//eliminate duplicates we use hashset
		HashSet<String> hs = new HashSet<String>();
		//read the  list by using for loop and eliminate index
		for(int i=1;i<Result.size();i++) {
			WebElement Option = Result.get(i);
			//get the text of webelement
			String DropDownOption = Option.getText();
			System.out.println(DropDownOption);
			//add the dropdown into hashset and remove duplicates from dropdown
			hs.add(DropDownOption);
		}
		Thread.sleep(2000);
		for(String Elements:hs) {
		   System.out.println(Elements);	
		}
		}
}
