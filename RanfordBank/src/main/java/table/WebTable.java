package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.BaseClass;

public  class WebTable 

{
public static void tableHandle( WebDriver driver,By prop,String id,String operation)


	{
		
		try {
			boolean flag =false;
			boolean status=false;
			WebElement table= driver.findElement(prop);
					                                     //driver.findElement(By.xpath("//td[@xpath='1']"));
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
			for (int i = 1; i < pagelinks.length; i++)
			{
				table=driver.findElement(prop);
				rows=table.findElements(By.tagName("tr"));
				
				
				for (WebElement r : rows)
				{
				List<WebElement>columns=r.findElements(By.tagName("td"));
				
					for (WebElement c : columns) 
					{
						if(c.getText().matches(id));//id means 23,24
						{
							if(operation.equalsIgnoreCase("edit"))//operation  means either edit or delete
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							}
							
							
							else if(operation.equalsIgnoreCase("delete"))
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							}
							else
							{
								
								System.out.println("operation is fail");
							}
							
							flag=true;
							break;
						}
					
					}
					if(flag==true)
					break;
				}
				
			
			
			try 
			{
				if(pagelinks[i].contains("...") && status==true)
				{
					driver.findElement(By.xpath("//a[text()='...'][2]")).click();
				}
				else
				{
					table.findElement(By.linkText(pagelinks[i])).click();
				}
			} 
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			if(pagelinks[i].contains("..."))
			{
				status=true;
				tableHandle(driver,prop,id,operation);
				
			}
			
			}
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



