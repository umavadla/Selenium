package TestNG_Progs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Thirdprog {
  @Test
  public void f() {
	  System.out.println("iam  @test f");

  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("iam  @test beforetest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("iam  @test aftertest");

  }
@Test
public void g() {
	System.out.println("iam @test g");
}
}
