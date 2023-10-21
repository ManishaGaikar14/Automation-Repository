package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//Launch Web Application using navigate method
	//so,we have to create a object of navigate class to access
	Navigation Nav = driver.navigate();
	//launch the web application
	Nav.to("https://www.selenium.dev/");
	Thread.sleep(2000);
	
	//to perform backword operation
	Nav.back();
	Thread.sleep(2000);
	
	//to perform forword operation
	Nav.forward();
	Thread.sleep(2000);
	
	//to refresh the browser
	Nav.refresh();
	Thread.sleep(2000);
	
	//to close all the open windows
	driver.quit();
	
	}

}
