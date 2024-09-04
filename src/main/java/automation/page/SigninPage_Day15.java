package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage_Day15 {
	private WebDriver driver;
	@FindBy(xpath ="//a[text()='Đăng ký']") WebElement buttonDangky;
	@FindBy(id="FullName") WebElement textFullName;
	@FindBy(id="DOB") WebElement textBirthday;
	@FindBy(id="Email") WebElement textEmail;
	@FindBy(id= "Password") WebElement textPassword;
	@FindBy(xpath="//span[@role='checkbox']") WebElement checkboxCaptcha;
	@FindBy(xpath="//input[@type='submit']") WebElement btnSignin;
	@FindBy(id="my_account") WebElement btnAvatar;
	@FindBy(xpath="//a[@title='Đổi mật khẩu']") WebElement btnUpdatePass;
	//OldPassword
	@FindBy(id="OldPassword") WebElement textOldPass;
	@FindBy(id="NewPassword") WebElement textNewPass;
	@FindBy(id="ConfirmNewPassword") WebElement textConfirmNewPass;
	@FindBy(id="onesignal-slidedown-cancel-button") WebElement cancelButton;
	@FindBy(xpath="//input[@value='Cập nhật']") WebElement updatePassbtn;
	@FindBy(xpath ="//button[text()='Đăng nhập']") WebElement buttonLogin;
	@FindBy(xpath ="//input[@name='keyword']") WebElement textSearch;
	@FindBy(xpath ="//button[@type='submit']") WebElement btnSearch;
	
	public SigninPage_Day15(WebDriver _driver) {
		this.driver =_driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void SiginFunction(String fullname, String birthday, String emai, String password) {

		try {
			while (cancelButton.isDisplayed()) {
				cancelButton.click();
			}
		} catch (Exception ex) {
		buttonDangky.click();
		textFullName.sendKeys(fullname);
		textBirthday.sendKeys(birthday);
		textEmail.sendKeys(emai);
		textPassword.sendKeys(password);
		checkboxCaptcha.click();
		btnSignin.click();
		}
	}
	
	
	public void UpdatePassword(String oldPass, String newPass) {

			btnAvatar.click();
			btnUpdatePass.click();
			textOldPass.sendKeys(oldPass);
			textNewPass.sendKeys(newPass);
			textConfirmNewPass.sendKeys(newPass);
			updatePassbtn.click();
		}
	
	public void LoginFunction(String email, String newpass)
	{
		textEmail.sendKeys(email);
		textNewPass.sendKeys(newpass);
		buttonLogin.click();
}
	public void SearchFuntion(String search)
	{
		textSearch.sendKeys(search);
		btnSearch.click();
}
}

