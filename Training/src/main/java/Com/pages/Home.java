package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(name="email")
	WebElement userid;
	@FindBy(name="pass")
	WebElement pssword;
	@FindBy(xpath="//*[@aria-label='Log In']")
	WebElement loginbutton;
	@FindBy(linkText="Forgot account?")
	WebElement forgotlk;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Emailidfield(String entereidmail) {
		userid.sendKeys(entereidmail);
	}
	public void psswordfield(String enterofpssword) {
		pssword.sendKeys(enterofpssword);
	}
		public void loginbt() {
			loginbutton.click();
		}
		public void forgotofpsswd() {
			forgotlk.click();
		}
}
