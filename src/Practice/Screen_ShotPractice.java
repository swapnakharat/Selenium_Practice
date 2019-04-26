package Practice;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Screen_ShotPractice 
{ 
	public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing Shastra\\All jar File\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		AShot as= new AShot();
		Screenshot sc=as.takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "PNG",new File("./screenshots/gmail.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	
	
		
	}

}
