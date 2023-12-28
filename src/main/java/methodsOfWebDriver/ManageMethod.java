package methodsOfWebDriver;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch Browser
	   WebDriver driver=new ChromeDriver();
	   //maximum browser using manage method
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   //minimize browser using manage method
	   Thread.sleep(2000);
	   driver.manage().window().minimize();
	   ////fullscreen browser using manage method
	   driver.manage().window().fullscreen();
	   
	   //Set The Size Of Browser
	   //to set size neet to create object of dimension class
	   // Dimension targetSize = new Dimension(350,450);
		//driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
	   //launch web application
	   //driver.get("");
	}

}
