package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
	
		//to take input from users
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the browser value!!!");
		String browserValue = sc.next();  //to get string type reference press ctr1 by keeping the curser on browser
	
		if(browserValue.equalsIgnoreCase("chrome")) {
		    driver=new ChromeDriver();
			System.out.println("ChromeDriverIsOpen");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("ChromeDriverIsClose");
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("FireFoxDriverIsOpen");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("FireFoxDriverIsClose");
		}
		else if(browserValue.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("EdgeDriverIsOpen");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("EdgeDriverIsClose");
		}	
		else {
			System.out.println("Enter Valid Browser");
		}
	}
}