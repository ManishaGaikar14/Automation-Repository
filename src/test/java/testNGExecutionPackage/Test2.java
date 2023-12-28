package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	  public void method1() {
		  Reporter.log("Method 1 from Test2",true);  
		  }
	  
	  @Test
	  public void method2() {
		  int a=5;
		  int b=0;
		  int res=a/b;
		  Reporter.log("Method 2 from Test2"+res,true);  
		  }
}
