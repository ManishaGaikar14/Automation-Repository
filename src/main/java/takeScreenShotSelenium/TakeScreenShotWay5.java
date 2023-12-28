package takeScreenShotSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay5 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot)driver;
		driver.get("https://www.selenium.dev/");
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("./ScreenShots/Selenium14way5.jpg");
		Files.copy(src, file);
		driver.close();
	}

}
