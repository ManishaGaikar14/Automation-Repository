package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
  @Test(description="It Is Use To Perform LoginPage",enabled=true)
  public void LoginPage() {
	  Reporter.log("First Method LoginPage",true);
  }
  @Test(description="It Is Use To Perform UserPage",enabled=true)
  public void UserPage() {
	  Reporter.log("First Method UserPage",true);
  }
  @Test(description="It Is Use To Perform LogoutPage",enabled=true)
  public void LogoutPage() {
	  Reporter.log("First Method LogoutPage",true);
  }
}
