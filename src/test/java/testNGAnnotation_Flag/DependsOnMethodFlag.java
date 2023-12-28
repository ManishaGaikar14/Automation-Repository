package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodFlag {
	
	//without dependsOnMethods() the method will execute alphabetical order,so to perform it serially we are using dependsOn Methods
  @Test(description="Login Performed")
  public void login() {
	  Reporter.log("Login Page", true);  }
  
  
  //this method depends on login method so add depends on method,to perform script serially

  @Test(description ="User Created",dependsOnMethods="login")
  public void createUser() {
	  Reporter.log("Create user", true);
  }
  
  
  //this method depends on create user method so add depends on method,to perform the script serially
  @Test(description="Logout Performed",dependsOnMethods="createUser")
  public void logout() {
	  Reporter.log("logout Page", true);
  }
}
