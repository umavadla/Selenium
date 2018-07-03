package TestNG_Progs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class secondprog {
  @Test//from this test it displays
  public void f() {
	  System.out.println("i am @test");

  }
  @BeforeClass//these 2 r optional...precondition scripts will write here
  public void beforeClass() {
	  System.out.println("i am @beforeclass");
  }

  @AfterClass//post conditions will write here
  public void afterClass() {
	  System.out.println("i am @afterclass");

  }

}
