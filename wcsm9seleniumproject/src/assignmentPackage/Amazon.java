package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg03bJWYVYOBpkGjvm90p9vbmTjiolJKT7O8hEkYzn__oAAAAAQAAAABlBr4_cmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=260-9202697-5095927&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	Thread.sleep(2000);
	//driver.findElement(By.tagName("a")).click();
	driver.findElement(By.id("ap_email")).sendKeys("abcde1234@gmail.com");
	driver.findElement(By.id("createAccountSubmit")).click();
	driver.findElement(By.id("ap_customer_name")).sendKeys("pujaa");
	driver.findElement(By.id("ap_email")).sendKeys("abcd12@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("abcs@12");
	driver.findElement(By.id("ap_password_check")).sendKeys("abcd@12");
	driver.findElement(By.id("continue")).click();
	}
}
