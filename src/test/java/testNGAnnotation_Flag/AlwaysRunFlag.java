package testNGAnnotation_Flag;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
	@Test
	  public void method1() {
		  Reporter.log("It Is Pass TC",true);
	  }
	  @Test(alwaysRun = true)
	  public void method2() {
		  Assert.fail("It Is Fail TC");
		  Reporter.log("method2",true);
	  }
}
