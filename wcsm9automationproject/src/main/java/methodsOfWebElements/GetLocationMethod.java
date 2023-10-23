package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.navigate().to("http://demoapps.qspiders.com/");
WebElement emailTestBox = driver.findElement(By.cssSelector("input#email"));
//to get location of email text box
Point loc = emailTestBox.getLocation();
int xaxis = loc.getX();
int yaxis = loc.getY();
System.out.println("Location Of Email TextBox :"+xaxis+":"+yaxis);
}
}
