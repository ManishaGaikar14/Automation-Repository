package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnocationCountFlag {
	//invocationCount is act like for loop
  @Test(invocationCount = 1000)
  public void method1() {
	  Reporter.log("Method1 Is For InnocationCount");
  }
}
