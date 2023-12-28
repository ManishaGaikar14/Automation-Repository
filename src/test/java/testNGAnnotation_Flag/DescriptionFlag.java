package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description="This perform Login Operation")
  public void method1() {
	  Reporter.log("It Is Method1",true); 
	  }
}
