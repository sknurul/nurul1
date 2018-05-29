package com.ranford1.RanfordBank;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

import testbase.BaseClass;

	public class Newbranchentry  extends BaseClass
	{
		public static WebElement branchname(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_brname_id")));

		}

		public static WebElement address1(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_address1_id")));

		}

		public static WebElement address2(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_address2_id")));

		}

		public static WebElement address3(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_address3_id")));

		}

		public static WebElement area(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_are_id")));

		}

		public static WebElement zipcode(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_zipcode_id")));

		}

		public static Select country(WebDriver driver)

		{
			return new Select(driver.findElement(By.id(element("newbr_country_id"))));

		}

		public static Select state(WebDriver driver)

		{
			return new Select(driver.findElement(By.id(element("newbr_state_id"))));

		}

		public static Select city(WebDriver driver)

		{
			return new Select(driver.findElement(By.id(element("newbr_city_id"))));

		}

		public static WebElement submit(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_submit_id")));

		}

		public static WebElement reset(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_reset_id")));

		}

		public static WebElement cancel(WebDriver driver)

		{
			return driver.findElement(By.id(element("newbr_cancel_id")));

		}

	}


