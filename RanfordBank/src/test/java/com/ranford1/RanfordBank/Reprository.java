package com.ranford1.RanfordBank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import excel.Excal_class;
import table.WebTable;
import testbase.BaseClass;
import utility.LibreryClass;
import utility.ValidationClass;

public class Reprository extends BaseClass {

	WebDriver driver;

	public void login() throws InterruptedException 
	{
		
		homepage.username_textbox(driver).sendKeys(config("user_name"));
		homepage.pass_textbox(driver).sendKeys(config("password"));
		Thread.sleep(3000);
		homepage.login_textbox(driver).click();
		if(ValidationClass.isTextPresent(driver, "Welcome to Admin"))
		{
			Reporter.log(" login test is pass");
		}
		else{
			Reporter.log(" login test is fail");
			LibreryClass.screenShot("login");
		}
	}

	public void launchapp(String brow)
	{
		if(brow.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\NURUL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		/*else if(brow.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}*/
		
		/*else if(brow.equalsIgnoreCase("ie"))
		{
			driver=new  InternetExplorerDriver();
		}*/
		driver.get("http://183.82.100.55/ranford1/home.aspx");
		driver.manage().window().maximize();
		

	}

	public void closeapp() {
		driver.close();
	}

	public void branches() 
	{
		Adminhomepage.branches(driver).click();
		Branchdetails.country(driver).selectByVisibleText("INDIA");
		Branchdetails.states(driver).selectByVisibleText("GOA");
		Branchdetails.city(driver).selectByVisibleText("GOA");
		Branchdetails.search(driver).click();

	if(	ValidationClass.isTitlePresent(driver,"admin_banker_master"))
		{
			Reporter.log("branches test pass");
		}
	else {
		Reporter.log("branches test fail");
		LibreryClass.screenShot("branches");
	}
	}

	public void newbranch(String branch,String adress1,String dress2,String dress3,String atra,String zipcode)
	{
		Branchdetails.newbranch(driver).click();
		Newbranchentry.branchname(driver).sendKeys("branch");
		Newbranchentry.address1(driver).sendKeys("adress1");
		Newbranchentry.address2(driver).sendKeys("dress2");
		Newbranchentry.address3(driver).sendKeys("dress3");
		Newbranchentry.area(driver).sendKeys("atra");
		Newbranchentry.zipcode(driver).sendKeys("zipcode");
		Newbranchentry.country(driver).selectByVisibleText("INDIA");
		
		Newbranchentry.state(driver).selectByVisibleText("GOA");
		
		Newbranchentry.city(driver).selectByVisibleText("GOA");
		
		Newbranchentry.submit(driver).click();
		if(ValidationClass.isAlertPresent(driver,"ok"))
		{
			Reporter.log("new branch test pass");
		}
		else
		{
			Reporter.log("new branch test fail");
		}
		
		driver.switchTo().alert().accept();
		
	}

	public void newrole(String rolename,String roledesk,String roletype) 
	{
		Adminhomepage.roles(driver).click();
		Role.newrole(driver).click();
		Newrole.rolename(driver).sendKeys("rolename");
		Newrole.roledesc(driver).sendKeys("roledesk");
		Newrole.roletype(driver).selectByVisibleText("roletype");
		Newrole.submit(driver).click();
		if(ValidationClass.isAlertPresent(driver,"ok"))
		{
			Reporter.log("new role test  pass");
		}
		else
		{
			Reporter.log("new role  test fail");
		}
		driver.switchTo().alert().accept();
	}

	public void newemployee(String empname,String loginpwd,String role,String branch)
	{
		Adminhomepage.employee(driver).click();
		Employee.newemployee(driver).click();
		Newemployee.emloyeename(driver).sendKeys(empname);
		Newemployee.loginpwd(driver).sendKeys(loginpwd);
		Newemployee.role(driver).selectByVisibleText(role);
		Newemployee.branch(driver).selectByVisibleText(branch);
		Newemployee.submit(driver).click();
		if(ValidationClass.isAlertPresent(driver,"ok"))
		{
			Reporter.log("new  employee  test pass");
		}
		else
		{
			Reporter.log("new  employee test fail  ");
			LibreryClass.screenShot("newemployee");
		}
		driver.switchTo().alert().accept();
	}

	public Object[][] excelContent(String filename,String sheetname)
	
	{
		
		Excal_class.excelConnection(filename, sheetname); 
		
		int rc=Excal_class.rowCount();
		int cc=Excal_class.columnCount();
		
		
		String [][] data=new String[rc-1][cc];
		
		for (int r = 1; r < rc; r++)
		{
			for (int c = 0; c < cc; c++)
			{
				data [c][r] = Excal_class.readData(c,r);
			}
		}
		return data;
		
	}
	
	public   void  verify_webtable()
	{
		Adminhomepage.branches(driver).click();
		WebTable.tableHandle(driver, By.id("DG_bankdetails"), "65", "edit");
		
	}
	

}
