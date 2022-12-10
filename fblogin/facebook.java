package fblogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class facebook {


	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");


		// using ancestor			
driver.findElement(By.xpath("//input[@id='secondpassword']//ancestor::div//input[@placeholder='First Name']")).sendKeys("Aaron");

		//using following
		driver.findElement(By.xpath("//input[@placeholder='First Name']//following::input[@placeholder='Last Name']")).sendKeys("christopher");
		Thread.sleep(2000);
		//using following sibling

		driver.findElement(By.xpath("//label[.='Address']//following::textarea")).sendKeys("address are not mentioned");
		
		driver.findElement(By.xpath("//input[ @value='Male']")).click();

		driver.findElement(By.xpath("//label[.='Hobbies']//following-sibling::div//input")).click();

		driver.findElement(By.xpath("//label[.='Hobbies']//following-sibling::div//input[@id='checkbox2']")).click();
		Thread.sleep(2000);

		//using and 
		driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']")).sendKeys("9080634335");

		//using child

		driver.findElement(By.xpath("//div[@id='eid']//child::input[@type='email']")).sendKeys("aaron@gmail.com");
		Thread.sleep(2000);

		//using preceding

		driver.findElement(By.xpath("//input[@id='secondpassword']//preceding::div//input[@id='firstpassword']")).sendKeys("12345678");
		Thread.sleep(2000);



		//selecting drop down box


		WebElement drop=driver.findElement(By.id("Skills"));
		Select obj = new Select(drop);
		obj.selectByIndex(3);
		Thread.sleep(2000);



		WebElement drop2=driver.findElement(By.id("country"));
		Select select = new Select(drop2);

		select.selectByValue("Denmark");
		Thread.sleep(2000);

		//using descendant

		driver.findElement(By.xpath("//div//descendant::input[@id='secondpassword']")).sendKeys("confirm");
		Thread.sleep(2000);
		


		WebElement lan =driver.findElement(By.xpath("//div[@id='msdd']"));lan.click();
		WebElement lan1 =driver.findElement(By.xpath("//a[contains(.,'Greek')]"));lan1.click();
		
		
		WebElement lan3 =driver.findElement(By.id("yearbox"));
		Select any=new Select(lan3);
		any.selectByVisibleText("1999");
		
		WebElement lan4 =driver.findElement(By.xpath("//select[ @placeholder=\'Month\']"));
		Select ani=new Select(lan4);
		ani.selectByVisibleText("December");
		
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).isDisplayed();
		
		
		System.out.print("- Mission Completed Successfully-");
		//driver.quit();
	}
}
