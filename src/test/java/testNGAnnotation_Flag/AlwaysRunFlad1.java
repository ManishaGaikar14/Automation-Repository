package testNGAnnotation_Flag;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlad1 {
	  @Test(description="Login Performed")
	  public void login() {
		  Reporter.log("Login Page", true);  }
	  
	  @Test(description ="User Created",dependsOnMethods="login")
	  public void createUser() {
		  Assert.fail();
		  Reporter.log("Create user", true);
	  }
	  //assert will skip this also bcos it depends of create user which is fail
	  //so,we need to use alwaysRun()
	  @Test(description="Logout Performed",dependsOnMethods="createUser",alwaysRun = true)
	  public void logout() {
		  Reporter.log("logout Page", true);
	  }
}
