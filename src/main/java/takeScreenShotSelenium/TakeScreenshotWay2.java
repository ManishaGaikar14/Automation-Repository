package takeScreenShotSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenshotWay2 {
	public static void main(String[] args) throws IOException {
		
		RemoteWebDriver rwd=new ChromeDriver();
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rwd.get("https://www.selenium.dev/");
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File file = new File("./Screenshots/seleium.jpg");
		Files.copy(src, file);
		rwd.close();
	}

}
