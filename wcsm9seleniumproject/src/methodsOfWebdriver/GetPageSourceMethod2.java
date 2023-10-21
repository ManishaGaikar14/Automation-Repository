package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/india");
		String title = driver.getTitle();
		System.out.println(title);
		Object currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
        GetPageSourceMethod2 returnSourceCode = new GetPageSourceMethod2();
        System.out.println(returnSourceCode);
        driver.quit();
	}

}
