package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
   WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
   login.getAttribute("name");
   
   //driver.findElement(By.xpath(null))
   
}
}
