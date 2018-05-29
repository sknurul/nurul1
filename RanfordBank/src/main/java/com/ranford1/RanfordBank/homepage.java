package com.ranford1.RanfordBank;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.BaseClass;

public class homepage extends BaseClass
{

	public static WebElement username_textbox(WebDriver driver)

	{
		return driver.findElement(By.name(element("username_name")));

	}

	public static WebElement pass_textbox(WebDriver driver)

	{
		return driver.findElement(By.name(element("password_name")));

	}

	public static WebElement login_textbox(WebDriver driver)
	{
		return driver.findElement(By.name(element("loginbutton_name")));
	}




}
