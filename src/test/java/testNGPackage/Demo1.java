package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method3() {
	  Reporter.log("Method 1 from demo1 class", true); 
	  }
  @Test
  public void method4() {
	  Reporter.log("Method 2 fro  demo1 class", true);
  }
}
