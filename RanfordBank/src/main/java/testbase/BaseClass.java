package testbase;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	static Properties property;
	static	FileReader fr = null ;
	public static void loadproperty() {

		try
		{
			File f = new File(System.getProperty("user.dir"
					+ "\\src\\main\\java\\configuration\\config.properties"));

			fr = new FileReader(f);

			property = new Properties();

			property.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(fr !=null)
			{
				try
				{
					fr.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static String config(String key) {
		loadproperty();
		String x = property.getProperty(key);
		return x;
	}
	public static void loadproperty1()
	{

		try
		{
			File f = new File(System.getProperty("user.dir")
					+ "\\src\\main\\java\\configuration\\or.properties");

			FileReader fr = new FileReader(f);

			property = new Properties();

			property.load(fr);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(fr !=null)
			{
				try
				{
					fr.close();
				} 
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	public static String element(String key) {
		loadproperty1();
		String x = property.getProperty(key);
		return x;
	}


}


