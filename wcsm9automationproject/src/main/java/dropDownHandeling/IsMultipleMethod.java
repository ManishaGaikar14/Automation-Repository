package dropDownHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultipleMethod {
public static void main(String[] args) {
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demoapps.qspiders.com/");
  driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
  //single select dropdown
 // driver.findElement(By.xpath(""));
}
}
