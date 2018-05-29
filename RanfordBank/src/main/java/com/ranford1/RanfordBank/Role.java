package com.ranford1.RanfordBank;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import testbase.BaseClass;

	public class Role  extends BaseClass
	{
		public static WebElement newrole(WebDriver driver) {
			return driver.findElement(By.id(element("newrole_id")));
		}

	}


