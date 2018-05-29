package com.ranford1.RanfordBank;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

import testbase.BaseClass;

	public class Newrole extends BaseClass
	{
		public static WebElement rolename(WebDriver driver)

		{
			return driver.findElement(By.id(element("role_name_id")));

		}

		public static WebElement roledesc(WebDriver driver)

		{
			return driver.findElement(By.id(element("role_desc_id")));

		}

		public static Select roletype(WebDriver driver)

		{
			return new Select(driver.findElement(By.id(element("role_type_id"))));

		}

		public static WebElement submit(WebDriver driver)

		{
			return driver.findElement(By.id(element("role_submit_id")));

		}

		public static WebElement submitquery(WebDriver driver)

		{
			return driver.findElement(By.id(element("role_submitquery_id")));

		}

		public static WebElement cancel(WebDriver driver)

		{
			return driver.findElement(By.id(element("role_cancel_id")));

		}

	}
