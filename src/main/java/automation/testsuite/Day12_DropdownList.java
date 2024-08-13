package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_DropdownList extends CommonBase{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY3);
	}
	
	@Test
	public void case1_DropdownList()
	{
	Select dropdownDay =new Select(driver.findElement(By.id("select-demo")));
	//Case1:Kiem tra size cua dropdown list
	assertEquals(dropdownDay.getOptions().size(),8);
	
	//Case2: chon Monday bang cach thu nhat, kiem tra gia tri sau khi chon
	dropdownDay.selectByVisibleText("Monday");
	assertEquals (dropdownDay.getFirstSelectedOption().getText(),"Monday");
	
	//case3: chon Tuesday bang cach2, kiem tra gias tri sau khi chon
	
	dropdownDay.selectByValue("Tuesday");
	assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Tuesday");
	
	//case3: chon Sunday bang cach 3, kiem tra gia tr sau khi chon
	dropdownDay.selectByIndex(1);
	assertEquals(dropdownDay.getFirstSelectedOption().getText(),"Sunday");
	}
}
