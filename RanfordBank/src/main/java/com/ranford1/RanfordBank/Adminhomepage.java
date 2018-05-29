package com.ranford1.RanfordBank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.BaseClass;

public class Adminhomepage extends BaseClass
{
	public static WebElement logout(WebDriver driver) {
		return driver.findElement(By
				.xpath(element("logout_xpath")));
	}

	public static WebElement branches(WebDriver driver) {
		return driver.findElement(By
				.xpath(element("branches_xpath")));
	}

	public static WebElement roles(WebDriver driver) {
		return driver.findElement(By
				.xpath(element("roles_xpath" )));
	}

	public static WebElement users(WebDriver driver) {
		return driver.findElement(By
				.xpath(element("users_xpath")));
	}

	public static WebElement employee(WebDriver driver) {
		return driver.findElement(By.xpath(element("employee_xath")));
	}
}


