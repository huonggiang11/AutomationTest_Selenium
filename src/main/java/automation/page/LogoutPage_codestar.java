package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage_codestar {
	private WebDriver driver;

	public LogoutPage_codestar(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LogoutFunction() {
		WebElement btnAdmin = driver.findElement(By.xpath("//a[normalize-space()='Admin']"));
		btnAdmin.click();
		
		WebElement  btnLogout = driver.findElement(By.xpath("//button[text()='Đăng xuất' and @type='button']"));
		btnLogout.click();
		
		WebElement btnConfirmLogout = driver.findElement(By.xpath("//button[text()='Đăng xuất' and @type='submit']"));
		btnConfirmLogout.click();
	}
}

