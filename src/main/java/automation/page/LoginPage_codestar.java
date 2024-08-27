package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_codestar {
	private WebDriver driver;

	public LoginPage_codestar(WebDriver _driver) {
		this.driver = _driver;
	}
	
	public void LoginFunction(String email, String password) {
	
		WebElement textEmail= driver.findElement(By.id("email"));
		if(textEmail.isDisplayed())
		{
			textEmail.sendKeys(email);
		}
		
		WebElement textPassword= driver.findElement(By.id("password"));
		if(textPassword.isDisplayed())
		{
			textPassword.sendKeys(password);
		}
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[text()='Đăng nhập' and @type='submit']"));
		if(btnLogin.isDisplayed())
		{
			btnLogin.click();
		}

	}
}


