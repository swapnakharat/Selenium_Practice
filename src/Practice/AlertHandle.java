package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// alert can be handle using alert interface and in this we use some methods like void dismiss(),void accept(), String getText(),void sendKeys(String stringToSend)
public class AlertHandle
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Shastra\\All jar File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();
        
        Alert alert=driver.switchTo().alert();
        
        String alertMessage=driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(5000);
        
        alert.accept();
        
        

	}

}
