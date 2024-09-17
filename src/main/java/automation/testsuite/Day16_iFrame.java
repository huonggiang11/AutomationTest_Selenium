package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_iFrame extends CommonBase{

	@BeforeMethod
	public void openChrome() {
		driver= initChromeDriver(CT_PageURLs.URL_CRMSTAR2);
	}
	
	@Test
	public void handleIframeDangkyTuVan()
	{
		scrollToElement(By.xpath("(//iframe[@title='Khách hàng'])[1]"));
		WebElement btnGuingay= getElementPresentDOM(By.xpath("(//iframe[@title='Khách hàng'])[1]"));
		driver.switchTo().frame(btnGuingay);
		System.out.println("Switch tới Iframe Đăng ký tư vấn lộ trình thành công");
		type(By.id("name"),"Testname");
		type(By.id("phone_number"),"123456789");
		click(By.xpath("//button[normalize-space()='Gửi ngay']"));
		assertTrue(isElementVisibility(By.xpath("//button[normalize-space()='Gửi ngay']")));
	}
	}



