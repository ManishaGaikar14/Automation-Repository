package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {
  @Test
  public void annotation_Test_Method() {
	  Reporter.log("Test Annotation", true);
  }
  @BeforeMethod
  public void annotation_Before_Method() {
	  Reporter.log("Before Method Annotation", true);
  }
  @BeforeClass
  public void annotation_Before_Class() {
	  Reporter.log("Before Class", true);
  }
  @AfterClass
  public void annotation_After_Class() {
	  Reporter.log("After Class", true);
  }
  
  @AfterMethod
  public void annotation_After_Method() {
	  Reporter.log("After_Method", true);
  }
  
  @AfterTest
  public void annotation_After_Test() {
	  Reporter.log("After Test", true);
  }
  
  @BeforeTest
  public void annotation_Before_Test() {
	  Reporter.log("Before Test",true);
	  
  }
  @AfterSuite
  public void annotation_After_Suit() {
	  Reporter.log("After Suit", true);
  }
  
  @BeforeSuite
  public void annotation_Before_Suit() {
	  Reporter.log("Before Suit", true);
  }
  
  @Test
  public void test2() {
	  Reporter.log("Test 2",true);
  }
}