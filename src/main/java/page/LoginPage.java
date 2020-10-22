package page;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.DatabaseConnection;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement USERNAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement PASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_LOCATOR;

	
	public void enterUserName(String username) throws ClassNotFoundException, SQLException {
		USERNAME_LOCATOR.sendKeys(username);
	}

	public void enterPassword(String password) throws ClassNotFoundException, SQLException {	
		PASSWORD_LOCATOR.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGNIN_LOCATOR.click();
	}
}
