package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority = 3)
  public void f() {
	  Reporter.log("Method of f()",true);
  }
  @Test(priority = 3)
  public void p() {
	  Reporter.log("Method of p()",true);
  }
  @Test(priority = 0)
  public void s() {
	  Reporter.log("Method of s()",true);
  }
  @Test
  public void k() {
	  Reporter.log("Method of k()",true);
  }
  @Test(priority = 1)
  public void a() {
	  Reporter.log("Method of a()",true);
  }
  @Test(priority = 4)
  public void h() {
	  Reporter.log("Method of h()",true);
  }
}
