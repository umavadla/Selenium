package TestNG_Progs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Enabledtest {
  @Test
  public void f() {
	  System.out.println("iam  @test f");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("iam @beforetest");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("iam @afterclass");
	  
  }
  @Test(enabled=false)//it will go in hide mode or it wont execute
  public void uoib() {
	  System.out.println("iam  @test uoib");
}
  @Test
  public void r() {
	  System.out.println("iam  @test r");
  }
	  @Test
	  public void g() {
		  System.out.println("iam  @test g");
	  }
}
