package fblogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class first {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*	
		driver.get("https://www.youtube.com/");

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ww = driver.findElement(By.xpath("//input[@id='search']"));
		ww.sendKeys("where are you  now");

		Thread.sleep(3000);
		Actions u = new Actions(driver);

		u.sendKeys(Keys.ENTER).build().perform();

		WebElement www = driver.findElement(By.linkText("Alan Walker"));
		www.click();

		u.sendKeys(Keys.PAGE_DOWN).build().perform();

		// u.doubleClick().build().perform();
		Thread.sleep(8000);

		WebElement we = driver.findElement(By.xpath("//span[.='Home']"));
		we.click();

		u.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();

		JavascriptExecutor hee = (JavascriptExecutor) driver;
		hee.executeScript("window.scroll(0, 800)");
		
		System.out.println("song played succesfully");
		
		*/
		
		
		
		
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		driver.switchTo().frame(3);
		
		
		Actions drgaddrp=new Actions(driver);
		
	//	WebElement tr=driver.findElement(By.id("Accepted Elements"));tr.click();
		
	//	WebElement dra=driver.findElement(By.xpath("//ul[@id='gallery']//following::h5[.='High Tatras']"));
		
		WebElement dra=driver.findElement(By.xpath("(//h5[contains(.,'High Tatras')])[1]"));
		
		
		WebElement drp=driver.findElement(By.id("trash"));
		
	
		
		
		
		
	drgaddrp.dragAndDrop(dra, drp).build().perform();
	System.out.println("drag and drop  completed");
	
	Thread.sleep(1500);
	
	driver.switchTo().defaultContent();
	WebElement ttr=driver.findElement(By.id("Accepted Elements"));
	
	drgaddrp.doubleClick(ttr).build().perform();
	Thread.sleep(1500);
	
	
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	
	String ss = driver.getCurrentUrl();
	System.out.println("Title for this Current Url:    " + ss);
	System.out.println();
	
	
	
	
	
	
	
	WebElement rr =driver.findElement(By.linkText("Free Ebooks"));
	
	drgaddrp.moveToElement(rr).build().perform();
	
	
	WebElement d=driver.findElement(By.linkText("Free Machine Learning Ebooks"));
	
	drgaddrp.moveToElement(d).perform();
	
	
	
	driver.quit();
		
		
		
		
		

		
		

	}

}
