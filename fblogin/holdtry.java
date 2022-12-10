package fblogin;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class holdtry {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/watch/live/?ref=live_delegate");
		
		
	WebElement one=driver.findElement(By.xpath("//input[@name='email']"));
	WebElement two=driver.findElement(By.xpath("//input[@name='pass']"));
	Actions act=new Actions(driver);
	act.moveToElement(one).click().sendKeys("aaron");
	act.keyDown(Keys.CONTROL).sendKeys("a","c");
	act.moveToElement(two).click().sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	driver.get("https://www.rapidtables.com/tools/notepad.html");
	
	
	WebElement onee=driver.findElement(By.xpath("//div[@id='private-alert']"));
	
	String copys=onee.getText();
	
	System.out.println("Lets change it: (Notepad - Facebook)     "     + copys);
	
	
	String copy=onee.getText().replace("Notepad", "Facebook");
	
	
	
	
	
	System.out.println(copy.codePointAt(1));
	
	System.out.println(copy.length());
	System.out.println(copy.contains(copys));
	
	System.out.println(copy.stripLeading());

	
	System.out.println(copy.hashCode());
	
	
	Point point = driver.findElement(By.xpath("//div[@id='private-alert']")).getLocation();
	  System.out.println("x pointer is  " + point.x);
	  System.out.println("y pointer is  " + point.y);
	  
	  
	  WebElement o=driver.findElement(By.xpath("(//span[.='×'])[4]"));o.click();
	  
	  
	  
	  System.err.println("Enter What you Want to Print in Notepad   :");
	  
	  
	  Scanner sss=new Scanner(System.in);
			  String ss=  sss.nextLine();
			  System.out.println(ss);
	  	
	
	  
	  
	WebElement on=driver.findElement(By.id("area"));on.sendKeys(ss);
	
			
	  	
	  	
	
	
	
	
	
	
	}

}
