package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testing Shastra\\All jar File\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/WebTable.html");
	    Thread.sleep(5000);
	    List<WebElement> firstname=driver.findElements(By.xpath("//div[@role='grid']/div[2]/div/div/div"));
	    Iterator itr=firstname.iterator();
	    System.out.println("no.of element:"+ firstname.size());
	    while(itr.hasNext()){
	    	WebElement element=(WebElement)itr.next();
	    	System.out.print(element.getText());
	    }
	    
	    
	    
	}

}
