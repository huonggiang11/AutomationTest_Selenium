package automation.page;

import java.awt.SecondaryLoop;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class UpdatePassword_PageFactory {

	private WebDriver driver;
	@FindBy(id="UserName") WebElement textEmail;
	@FindBy(id="Password") WebElement textPassword;
	@FindBy(xpath ="//button[text()='Đăng nhập']") WebElement buttonLogin;
	@FindBy(id="my_account") WebElement btnAvatar;
	@FindBy(xpath="//a[@title='Đổi mật khẩu']") WebElement btnUpdatePass;
	//OldPassword
	@FindBy(id="OldPassword") WebElement textOldPass;
	@FindBy(id="NewPassword") WebElement textNewPass;
	@FindBy(id="ConfirmNewPassword") WebElement textConfirmNewPass;
	
	@FindBy(id="onesignal-slidedown-cancel-button") WebElement cancelButton;
	
	@FindBy(xpath="//input[@value='Cập nhật']") WebElement updatePassbtn;
	
	public UpdatePassword_PageFactory(WebDriver _driver) {
		this.driver =_driver;
		PageFactory.initElements(_driver, this);
	}
	public void LoginFunction(String email, String pass)
	{
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		buttonLogin.click();
	}
	
	public void UpdatePassword(String oldPass, String newPass) {

	try {
		while (cancelButton.isDisplayed()) {
			cancelButton.click();
		}
	} catch (Exception ex) {
		btnAvatar.click();
		btnUpdatePass.click();
		textOldPass.sendKeys(oldPass);
		textNewPass.sendKeys(newPass);
		textConfirmNewPass.sendKeys(newPass);
		updatePassbtn.click();
	}
	}
}

