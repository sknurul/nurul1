package com.ranford1.RanfordBank;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import excel.Excal_class;

public class Textexecution extends Reprository {
	@Parameters({"browser"})
	@BeforeTest
	public void verifylaunch(String brows)
	{

		launchapp(brows);

	} 

	// Overriding
	@Test(priority = 1)
	public void verifylogin() throws InterruptedException {
		login();
	}

	@Test(priority = 2 )
	public void verifybranches()
	{
		branches();
	}


	/*	@Test(priority = 3,dataProvider="newbranches")
	public void verifynewbranch(String branch,String adress1,String dress2,String dress3,String atra,String zipcode)
	{
		newbranch(zipcode, zipcode, zipcode, zipcode, zipcode, zipcode);
	}*/


	/*@Test(priority = 4,dataProvider="newrole")
	public void verifynewrole(String rolename,String roledesk,String roletype)
	{
		newrole(roletype, roletype, roletype);
	}
	 */


	/*
	@Test(priority = 5,dataProvider="newemployee")
	public void verifynewemployee(String empname,String loginpwd,String role,String branch) {
		newemployee(empname, loginpwd, role, branch);
	}*/




	/*@DataProvider(name="newbranches")
	public Object[][] verify_content()
	{
		return excelContent("branchdata.xls", "sheet1");
	}
	 */


	/*@DataProvider(name="newemployee")
	public Object[][] verify_employee()
	{
		return excelContent("branchdata.xls", "sheet2");
	}
	 */

	/*@DataProvider(name="newrole")
	public Object[][] verify_newrole()
	{
		return excelContent("branchdata.xls", "sheet3");
	}
	//without data provider annotation
	public void excelContent()
	{
		Excal_class.excelConnection("branchdata.xls", "sheet1");
		Excal_class.outPutExcelConnection("branchdata.xls", "output.xls", "sheet1");

		for (int i = 1; i < Excal_class.rowCount(); i++) 
		{


			newbranch(Excal_class.readData(0, i),Excal_class.readData(1, i) ,Excal_class.readData(2, i) ,Excal_class.readData(3, i) ,Excal_class.readData(4, i) ,Excal_class.readData(5, i) );
		    String text= driver.switchTo().alert().getText();
		    driver.switchTo().alert().accept();
		    int j=Excal_class.columnCount();

		    if(text.contains("created successfully"))
		    {
		    	Excal_class.writeData(j++, i, "test pass");
		    }

		    else if(text.contains("already exist"))
		    {
		    	Excal_class.writeData(j++, i, "test fail");
		    }
		    else
		    {
		    	Excal_class.writeData(j, i, "test fail");
		    }
		}

	}*/


	@Test(priority=2)
	public void verify_webtable1()
	{
		verify_webtable();
	}
}

