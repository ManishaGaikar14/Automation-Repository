package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	  public void method1() {
		  Reporter.log("Method 1 from Test3",true); 
		  }
	  
	  @Test
	  public void method2() {
		  Reporter.log("Method 2 from Test3",true); 
		  }
}
