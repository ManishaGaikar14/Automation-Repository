package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void method1() {
	 Reporter.log("Method1 for the DemoClass1",true);
  } 
  @Test
  public void method2() {
		 Reporter.log("Method2 for the DemoClass1",true);
	  }
}
