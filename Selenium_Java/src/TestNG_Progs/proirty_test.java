package TestNG_Progs;

import org.testng.annotations.Test;

public class proirty_test {
  @Test(priority=4)
  public void z()
  {
	  System.out.println("iam @Test annotation z");
  }
  
  @Test(priority=1)
  public void login() {
	  System.out.println("Iam @TEST annotation login");
}
  @Test(priority=3)
  public void sendmail() {
	  System.out.println("Iam @TEST annotation sendmail");
}
  @Test(priority=2)
  public void logout() {
	  System.out.println("Iam @TEST annotation logout");
}
}
