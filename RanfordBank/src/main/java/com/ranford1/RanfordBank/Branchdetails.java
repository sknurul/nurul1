package com.ranford1.RanfordBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.BaseClass;

public class Branchdetails extends BaseClass
{
	public static Select country(WebDriver driver)

	{                                                                 //use of new is Select sel = new Select(wb)
		
		return new Select(driver.findElement(By.id(element("branch_country_id"))));

	}

	public static Select states(WebDriver driver)

	{
		return new Select(driver.findElement(By.id(element("branch_state_id"))));

	}

	public static Select city(WebDriver driver)

	{
		return new Select(driver.findElement(By.id(element("branch_city_id"))));

	}

	public static WebElement search(WebDriver driver)

	{
		return driver.findElement(By.id(element("branch_search_id")));

	}

	public static WebElement clear(WebDriver driver)

	{
		return driver.findElement(By.id(element("branch_clear_id")));

	}

	public static WebElement newbranch(WebDriver driver)

	{
		return driver.findElement(By.xpath(element("branch_newbranch_xpath")));

	}


}
