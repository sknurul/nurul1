package utility;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ValidationClass
{
public static boolean isTextPresent(WebDriver driver, String exp) 
{
	return driver.findElement(By.tagName("tbody")).getText().contains(exp);
}

public static boolean isTitlePresent(WebDriver driver, String exp) 
{
	return driver.getTitle().contains(exp);
}

public  static  boolean isAlertPresent(WebDriver driver ,String exp) 
{ 
    
        driver.switchTo().alert().getText().contains(exp);
        return true; 
}   
}


