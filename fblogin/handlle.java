package fblogin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class handlle {


	public static void main(String args[]) throws InterruptedException
	{

		try
		{


			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			Dimension d=new Dimension(350,700);
			
			
			driver.manage().window().setSize(d);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://www.redbus.in/");
			String lo=driver.getWindowHandle();

			System.out.println(lo.length());

			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,800)");

			WebElement start =driver.findElement(By.xpath("//a[.='About Us']"));start.click();
			Set<String> any=driver.getWindowHandles();	
			System.out.println(any);
			List<String> doo=new ArrayList<String>(any);

			driver.switchTo().window(doo.get(1));


			//WebElement web=driver.findElement(By.xpath("//div[@id=\'newFbId\']"));web.click();

			String ss=driver.getCurrentUrl();
			System.out.println("getTitle >    "+ss);
			// driver.close();
			driver.switchTo().window(lo);


			Thread.sleep(2000);

			WebElement starts =driver.findElement(By.xpath("//a[.='Help']"));starts.click();
			System.out.println("completed");


			driver.switchTo().window(doo.get(1));


		}
		catch(Exception e)
		{

			System.out.println("what error"+e);

		}

	}
}


