package dropDownHandeling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/DropDown.html");
		WebElement dropdown = driver.findElement(By.id("id"));
		Select element = new Select(dropdown);
		//get all option from dropdown by using getwrappedelement method is consider all element as a one webElement
		WebElement allOption = element.getWrappedElement();
		System.out.println(allOption);
		System.out.println(allOption.getText());
		//get all the options from dropdown using getoption....it condsider all option as single signle webelelment
		List<WebElement> option = element.getOptions();
		for(WebElement opt:option) {
			System.out.println(opt.getText());
		}
		//select option from dropdown without selection method
	    for(WebElement opt2:option) {
		if(opt2.getText().equals("Vadapav")) {
			opt2.click();
			break;
		}
		
	}
}
}