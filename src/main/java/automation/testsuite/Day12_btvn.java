package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_btvn extends CommonBase {

	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY4);
	}
	
	@Test
	public void case1_DropdownState()
	{
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		dropdownState.selectByVisibleText("California");
		assertFalse(dropdownState.isMultiple());
		assertEquals(dropdownState.getFirstSelectedOption().getText(),"California");
	}
	
	@Test
	public void case2_CheckDefaultHosting()
	{
		WebElement rdYes = driver.findElement(By.xpath("//input[@name='hosting' and @value='yes']"));
		assertFalse(rdYes.isSelected());
		
		WebElement rdNo= driver.findElement(By.xpath("//input[@name='hosting' and @value='no']"));
		assertFalse(rdNo.isSelected());
	
		if(rdYes.isDisplayed()) 
		{
		rdYes.click();
		assertTrue(rdYes.isSelected());
		assertFalse(rdNo.isSelected());
		}
		if(rdNo.isDisplayed())
		rdNo.click();
		assertTrue(rdNo.isSelected());
		assertFalse(rdYes.isSelected());
		
	}
}
