package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import testbase.BaseClass;

public class Excal_class  extends  BaseClass
{
	public static String folderpath=config("");
	static Sheet sh;
	 static Workbook wb;
static WritableWorkbook wwb;
static WritableSheet wsh;
	public static void excelConnection(String filename, String sheetname) 
	{
		File f =new File(folderpath+"filename");
		
		try
		{
			wb = Workbook.getWorkbook(f);        // workbookfactory.creat()
			Sheet sh=wb.getSheet(sheetname);
		} 
		catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static int rowCount()
	{
		int i=sh.getRows();
		return i;
	}
	
	public static int columnCount()
	{
		int i=sh.getColumns();
		return i;
	}
	public static String  readData(int col ,int row){
		return sh.getCell(col,row).getContents();  //get the value from particular cell like getStringcellvalue()
	}
	
	//another way
	
	public static void outPutExcelConnection(String iFileName,String oFileNAme,String sheetName)
	{
	
		try {
			FileInputStream fis =new FileInputStream(folderpath+ iFileName);
			 wb=Workbook.getWorkbook(fis);
			 sh=wb.getSheet(sheetName);
			 FileOutputStream fos=new  FileOutputStream(folderpath+oFileNAme);
			 wwb=Workbook.createWorkbook(fos,wb);    //wb.write("fos")
			 wsh=wwb.getSheet(sheetName);
			 
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		} 
		 
	}
	
	
	public static void writeData(int col,int row, String data)
	{
		
		try {
			Label l=new Label(col, row, data);
			wsh.addCell(l);                            //row.creatcell(col num)
		} catch (Exception e) {
			/*System.out.println(e);
			  System.out.println(e.getMessage());*/
			e.printStackTrace();
		}
		
		
	}
	
	public static void saveWorkBook()
	{
		try {
			wwb.write();
			wwb.close();
			wb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
