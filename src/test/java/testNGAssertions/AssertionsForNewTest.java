package testNGAssertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsForNewTest {
  @Test
  public void assertMethod() {
	  Reporter.log("Launch Browsers",true); 
	  Reporter.log("Launch WebApplication By Using URL",true);
	  Reporter.log("Verify And Validate The Login Pafe", true);
	  //apply softAssert
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(true,true);  //softAssert--->if you ass false still below statements are excuted
	  Reporter.log("Login Performed",true);
	  Reporter.log("Varify and validate the homepage", true);
	  //apply hardAssert
	  Assert.assertEquals(true, true); //hard assert--->IF WE GIVE FALSE here stop the exceution from this statement and above statement performed
	  Reporter.log("User Created",true);
	  Reporter.log("Task Created",true);
	  sa.assertAll(); //it will get fail if test case is failed
  }
}
