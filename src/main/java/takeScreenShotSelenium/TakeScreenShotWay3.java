package takeScreenShotSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		RemoteWebDriver rwd = (RemoteWebDriver) driver;
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rwd.get("https://mvnrepository.com/");
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File file = new File("./ScreenShots/maven.jpg");
		Files.copy(src, file);
		driver.close();
	}

}
