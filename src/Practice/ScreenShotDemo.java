package Practice;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

// by using AShot library we can take screenshots, it is specifically designed to capture screenshots.
public class ScreenShotDemo
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing Shastra\\All jar File\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		AShot ashot = new AShot();
		Screenshot sc=ashot.takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "JPG", new File("screenshots/facebook.png"));
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		
		
	}
	  
	
}
