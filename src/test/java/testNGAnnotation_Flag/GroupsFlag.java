package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsFlag {
	@Test(description="Functionality Testing1")
	  public void ft1() {
		  Reporter.log("Functionality Testing1",true);
	  }
	  @Test(description="Integration Testing1")
	  public void it1() {
		  Reporter.log("Integration Testing1",true);
	  }
	  
	  @Test(description="Smoke Testing1")
	  public void st1() {
		  Reporter.log("Smoke Testing1",true);
	  }
	  
	  //------------------------------------------------------

	  @Test(description="Functionality Testing2")
	  public void ft2() {
		  Reporter.log("Functionality Testing2",true);
	  }
	  @Test(description="Integration Testing2")
	  public void it2() {
		  Reporter.log("Integration Testing2",true);
	  }
	  
	  @Test(description="Smoke Testing2")
	  public void st2() {
		  Reporter.log("Smoke Testing2",true);
	  }
	  //-------------------------------------------------------------
	  
	  @Test(description="Functionality Testing3")
	  public void ft3() {
		  Reporter.log("Functionality Testing3",true);
	  }
	  @Test(description="Integration Testing3")
	  public void it3() {
		  Reporter.log("Integration Testing3",true);
	  }
	  
	  @Test(description="Smoke Testing3")
	  public void st3() {
		  Reporter.log("Smoke Testing3",true);
	  }
	  
	  //----------------------------------------------------------
	  
	  @Test(description="Functionality Testing2")
	  public void ft4() {
		  Reporter.log("Functionality Testing4",true);
	  }
	  @Test(description="Integration Testing4")
	  public void it4() {
		  Reporter.log("Integration Testing4",true);
	  }
	  
	  @Test(description="Smoke Testing4")
	  public void st4() {
		  Reporter.log("Smoke Testing4",true);
	  }
	  
	  //-----------------------------------------------------------
	  
	  @Test(description="Functionality Testing5")
	  public void ft5() {
		  Reporter.log("Functionality Testing5",true);
	  }
	  @Test(description="Integration Testing5")
	  public void it5() {
		  Reporter.log("Integration Testing5",true);
	  }
	  
	  @Test(description="Smoke Testing5")
	  public void st5() {
		  Reporter.log("Smoke Testing5",true);
	  }
	  
	 //-------------------------------------------------------------
	  
	  @Test(description="Functionality Testing6")
	  public void ft6() {
		  Reporter.log("Functionality Testing6",true);
	  }
	  @Test(description="Integration Testing6")
	  public void it6() {
		  Reporter.log("Integration Testing6",true);
	  }
	  
	  @Test(description="Smoke Testing6")
	  public void st6() {
		  Reporter.log("Smoke Testing6",true);
	  }
	  
}
