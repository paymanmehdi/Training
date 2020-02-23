package Run;

import org.testng.annotations.Test;

import Common.browsers;
import Com.pages.Home;

public class Home_Site extends browsers {
  @Test
  public void f() {
	 // Com.pages.Home home=new Com.pages.Home(driver);
	  Home h= new Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
  }
}
