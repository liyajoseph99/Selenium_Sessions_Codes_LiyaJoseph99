package selenium_TestNG_Examples;

import org.testng.annotations.Test;

public class LoginPage {
  @Test(priority = 1)
  public void email() {
	  System.out.println("email");
  }
  
  @Test(priority = 2)
  public void phoneNumber() {
	  System.out.println("phoneNumber"); 
  }
}
