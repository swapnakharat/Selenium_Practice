package Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotWithoutAShot 
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","E:\\Testing Shastra\\All jar File\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.naukri.com/mnjuser/homepage");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String timeStamp=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	try {
		FileUtils.copyFile(source, new File("./screenshots//abc1 " +timeStamp + ".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}	
}
