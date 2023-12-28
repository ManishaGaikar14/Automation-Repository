package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Method1() {
	  
	 // System.out.println("TestNGMethods1");
	  //Reporter.log("TestNGMethods1 form demo class");
	  Reporter.log("Test NG Methods1 form demo class", true);
  }
  @Test
  public void Method2() {
	  
		 // System.out.println("TestNGMethods1");
		  //Reporter.log("TestNGMethods1 form demo class");
		  Reporter.log("Test NG Methods2 form demo class1", false);
	  }
  
}
