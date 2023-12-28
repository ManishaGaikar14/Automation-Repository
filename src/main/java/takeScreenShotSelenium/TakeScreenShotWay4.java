package takeScreenShotSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay4 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		EventFiringWebDriver rwd = (EventFiringWebDriver) driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File file = new File("./ScreenShots/demoapway4.jpg");
		Files.copy(src, file);
		rwd.close();
	}
}
