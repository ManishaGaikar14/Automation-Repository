package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch a browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//stop the execution for 2sec
		Thread.sleep(2000);
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//stop the execution for 2sec
		Thread.sleep(2000);
		//click on open a pop window link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//stop the execution for 2sec
		Thread.sleep(2000);
		//close the broser....it close the all the window which are open/all the parent and child pop up window
		driver.quit();	
	}

}
