package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBTMyMbaJobs {
	public static void main(String[] args) {
	 WebDriver	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	 driver.get("https://www.mymbajobs.com/");
	}
}

