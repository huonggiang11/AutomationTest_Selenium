package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day17_btvn1 extends CommonBase{
	
	@BeforeMethod
	public void openChrome() {
			driver= initChromeDriver(CT_PageURLs.URL_MEDIAMART);
	}

	@Test
	public void handleIframeMessenger() {
		scrollToElement(By.xpath("//div[@class='widget-preview widget-preview--right']"));
		WebElement btnGuiTinNhan= getElementPresentDOM(By.xpath("//div[@class='widget-preview widget-preview--right']"));
		driver.switchTo().frame(btnGuiTinNhan);
		click(By.xpath("//div[text()='Gửi tin nhắn']"));
		assertTrue(isElementVisibility(By.xpath("//button[text()='Để lại tin nhắn']")));
		
	}
	@Test
	public void handleIframeZalo() {
		scrollToElement(By.xpath("//div[@class='logo']"));
		WebElement btnZalo= getElementPresentDOM(By.xpath("//div[@class='logo']"));
		driver.switchTo().frame(btnZalo);
		click(By.xpath("//div[@class='logo"));
		assertTrue(isElementVisibility(By.xpath("//div[text()='Xin chào! Siêu thị điện máy MediaMart rất vui được hỗ trợ bạn.']")));
	}
}
