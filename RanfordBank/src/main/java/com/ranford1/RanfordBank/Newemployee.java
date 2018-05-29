package com.ranford1.RanfordBank;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.BaseClass;

public class Newemployee  extends BaseClass
{
	public static WebElement emloyeename(WebDriver driver)

	{
		return driver.findElement(By.id(element("employee_name_id")));

	}

	public static WebElement loginpwd(WebDriver driver)

	{
		return driver.findElement(By.id(element("employee_loginpwd_id")));

	}

	public static Select role(WebDriver driver)

	{
		return new Select(driver.findElement(By.id(element("employee_role_id"))));

	}

	public static Select branch(WebDriver driver)

	{
		return new Select(driver.findElement(By.id(element("employee_branch_id"))));

	}

	public static WebElement submit(WebDriver driver)

	{
		return driver.findElement(By.id(element("employee_submit_id")));

	}

	public static WebElement reset(WebDriver driver)

	{
		return driver.findElement(By.id(element("employee_reset_id")));

	}

	public static WebElement cancel(WebDriver driver)

	{
		return driver.findElement(By.id(element("employee_cancel_id")));

	}

}
