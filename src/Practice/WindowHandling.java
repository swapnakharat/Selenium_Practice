package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class WindowHandling
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Shastra\\All jar File\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String mainWindow=driver.getWindowHandle();
		
		
		Set <String> s1=driver.getWindowHandles();
		Iterator<String> itr = s1.iterator();
		
		AShot ashot = new AShot();
		Screenshot sc= ashot.takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "PNG",new File("./screenshots/window.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!mainWindow.equalsIgnoreCase(childWindow))
				{
				// Switching to Child window
                driver.switchTo().window(childWindow);	                                                                                                           
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
                
                driver.findElement(By.name("btnLogin")).click();			
                             
		// Closing the Child Window.
                    driver.close();		
        }		
	}
		driver.switchTo().window(mainWindow);
		}
		
		
	}


