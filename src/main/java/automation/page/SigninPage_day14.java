package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class SigninPage_day14 {
	private WebDriver driver;
	@FindBy(xpath = "//a[text() = 'Đăng Ký']" )WebElement btnPagedangky;
	@FindBy(id= "txtFirstname")WebElement textName;
	@FindBy(id = "txtEmail") WebElement textEmail;
	@FindBy(id = "txtCEmail") WebElement textConfirmEmail;
	@FindBy(id = "txtPassword") WebElement textPassword;
	@FindBy(id = "txtCPassword") WebElement textConfirmPassword;
	@FindBy(id = "txtPhone") WebElement textPhone;
	@FindBy(xpath = "//button[text()= 'ĐĂNG KÝ' and @type='submit']") WebElement btnDangky;
	
	@FindBy(xpath = "//div[@class='avatar2']']") WebElement btnAVT;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']") WebElement btnEditInfor;
	@FindBy(xpath = "//input[@placeholder='Mật khẩu hiện tại']")WebElement textPassnow;
	@FindBy(id = "txtnewpass") WebElement  textPassnew;
	@FindBy(id = "txtrenewpass") WebElement textConfirmPassnew;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']") WebElement btnSavePass;

	public SigninPage_day14(WebDriver _driver) {
		this.driver = driver;
		PageFactory.initElements(_driver, this);
	}
	public void SigninFunction(String name, String email, String confirmEmai, String pass, String confirmPass, String phone) {
		btnPagedangky.click();
		textName.sendKeys(name);
		textEmail.sendKeys(email);
		textConfirmEmail.sendKeys(confirmEmai);
		textPassword.sendKeys(pass);
		textConfirmPassword.sendKeys(confirmPass);
		textPhone.sendKeys(phone);
		btnDangky.click();
	}
	
	public void Login_information(String Passnow,String Passnew, String ConfirmPassnew) {
		btnAVT.;
		btnEditInfor.click();
		textPassnow.sendKeys(Passnow);
		textPassnew.sendKeys(Passnew);
		textConfirmPassnew.sendKeys(ConfirmPassnew);
		btnSavePass.click();
	
	}
	
}
