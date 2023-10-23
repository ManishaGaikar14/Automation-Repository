package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo {
public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
      //implicit Wait
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
      driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
      //Explicit
    //WebDriverWait wait= new WebDriverWait(driver,duration,Dura)
}
}
