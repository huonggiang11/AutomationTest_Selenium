package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LogoutPageFactory {
	private WebDriver driver;
	@FindBy(xpath = "//a[normalize-space()='Admin']") WebElement btnAdmin;
	@FindBy(xpath = "//button[text()='Đăng xuất' and @type='button']") WebElement buttonLogout;
	@FindBy(xpath = "//button[text()='Đăng xuất' and @type='submit']") WebElement buttonConfirmLogout;
	
	public LogoutPageFactory(WebDriver _driver) {
		this.driver =_driver;
		PageFactory.initElements(_driver, this);
	}
	public void LogoutFunction() {
		btnAdmin.click();
		buttonLogout.click();
		buttonConfirmLogout.click();
		}
}


