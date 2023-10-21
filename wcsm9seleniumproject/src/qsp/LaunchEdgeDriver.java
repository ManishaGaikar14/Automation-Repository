package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		// launch chrome browser we need to create object of edge driver
		
		WebDriver driver= new EdgeDriver(); //here we upcasting to access methods from webdriver interface
		
		System.out.println("Edge is open");
		
		Thread.sleep(2000);  //(take curser on that line and click on add throw declaration we added exception automatically in front main method....here we getting interrupted Exception to resolve that exception we use throws Interrupted exception in front of main method
		
		driver.close(); //method from the driver class,we call it throw the driver obj.reference variable
		
		System.out.println("Edge is close");
	}
}
