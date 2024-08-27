package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_day14 {
	private WebDriver driver;
	@FindBy(xpath ="//a[text()='Đăng Nhập']") WebElement btnDangnhap;
	@FindBy(id="txtLoginUsername") WebElement textEmail;
	@FindBy(id="txtLoginPassword") WebElement textPassword;
	@FindBy(xpath ="//button[text()='ĐĂNG NHẬP' and @type='submit']") WebElement buttonLogin;
	public LoginPage_day14(WebDriver _driver) {
		this.driver =_driver;
		PageFactory.initElements(_driver, this);
	}
	public void LoginFunction(String email, String pass)
	{
		btnDangnhap.click();
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		buttonLogin.click();
	}
}
