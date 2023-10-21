package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistaraCssSelctor {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"cookieModalCloseBtn\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"flightSearchFrom\"]")).sendKeys("PNQ");
		driver.findElement(By.cssSelector("input[name=\"flightSearchTo\"]")).sendKeys("MNQ");
		driver.findElement(By.cssSelector("fieldset[id=\"calanderDiv\"]")).click();
		driver.findElement(By.cssSelector("label[id=\"depart-radio\"]")).click();
		driver.findElement(By.cssSelector("td[class=\" ui-datepicker-days-cell-over calanders everymundo ui-datepicker-current-day ui-datepicker-today\"]")).click();
		driver.findElement(By.cssSelector("td[class=\"  everymundo\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"passengers\"]")).click();
		driver.findElement(By.cssSelector("button[id=\"adds_adult\"]")).click();
		driver.findElement(By.cssSelector("button[class=\"col-xs-12 done_btn aubergine-button-dark passengerModalBtn\"]")).click();
		driver.findElement(By.cssSelector("button[id=\"book-flight-widget\"]")).click();
		//driver.findElement(By.cssSelector("input[id=\"departCalendar\"]")).click();
		//driver.findElement(By.cssSelector("a[class=\"ui-state-default ui-state-active\"]")).sendKeys("20/09/23");
		//driver.findElement(By.cssSelector(" div[id=\"calender_icon\"]")).click();
	}
}
