package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
	 @Test
	  public void method1() {
		 Reporter.log("Method1 for the DemoClass3",true);
	  } 
	  @Test
	  public void method2() {
			 Reporter.log("Method2 for the DemoClass3",true);
		  }
}
