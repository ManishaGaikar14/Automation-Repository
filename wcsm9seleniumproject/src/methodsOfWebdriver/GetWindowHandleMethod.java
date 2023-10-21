package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String titleOFpage = driver.getTitle();
		System.out.println(titleOFpage);
		
		//String sourcepage = driver.getPageSource();
		//System.out.println(sourcepage);
		
		String ParentHandle = driver.getWindowHandle();
		System.out.println(ParentHandle);
		
		driver.quit();
		
	}

}
