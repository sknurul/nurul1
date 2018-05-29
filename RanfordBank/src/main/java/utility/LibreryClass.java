package utility;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class LibreryClass
{
public static void   screenShot(String  screenname)
{
	try {
		Robot r = new Robot();
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(di);
		BufferedImage bf = r.createScreenCapture(rec);
		ImageIO.write(bf, "png", new File(".\\RanfordBank\\screen\\" + screenname + ".png"));
		
		
	} catch (Exception e)
	{
		
		e.printStackTrace();
	}
	
}
	
}

