package fblogin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ffff {


	@Test(enabled = true)

	void launch() throws InterruptedException {
		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);

			driver.get("https://nika2u.com/public/");

			WebElement searchbutton = driver.findElement(By.xpath("//button[@class='search-toggle']"));
			Actions nika = new Actions(driver);
			nika.moveToElement(searchbutton).click().perform();
			nika.sendKeys("Panasonic LED TV 43\" 4K UHD Android Smart").sendKeys(Keys.ENTER).build().perform();

			JavascriptExecutor hee = (JavascriptExecutor) driver;
			hee.executeScript("window.scroll(0, 800)");
			driver.manage().window().fullscreen();

			WebElement opens = driver.findElement(By.className("image-overlay"));
			opens.click();

			// WebElement open =
			// driver.findElement(By.xpath("//div[@class='content']"));open.click();
			driver.manage().window().maximize();
			JavascriptExecutor he = (JavascriptExecutor) driver;
			he.executeScript("window.scroll(0, 800)");

			Thread.sleep(2000);
			WebElement opennxt = driver.findElement(By.xpath("//span[.='Check out']//parent::button"));
			nika.moveToElement(opennxt).doubleClick(opennxt).build().perform();

			Thread.sleep(2000);
			driver.quit();

		}

		catch (WebDriverException e) {
			System.out.print("exception " + e);
		}
	}

	

	@Test(dependsOnMethods = "launch")

	void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		String flip = driver.getWindowHandle();

		WebElement web = driver.findElement(By.xpath("//button[.='✕']"));
		web.click();

		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("boAt Stone 350 10 W Bluetooth Speaker");
		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		WebElement click2 = driver.findElement(By.xpath("//div [.='Blue, Mono Channel']//parent::div"));
		click2.click();

		Set<String> flipkart = driver.getWindowHandles();

		List<String> cart = new ArrayList<String>(flipkart);

		driver.switchTo().window(cart.get(1));
		WebElement svg = driver.findElement(By.xpath("(//*[local-name()='svg']//parent::button)[2]"));
		svg.click();

		Thread.sleep(2000);

	}

	// @AfterMethod

	// @Test(enabled = false)
	// @Test(enabled = true)

	@Test(priority = 1)

	void close() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		driver.getWindowHandle();

		String first = driver.getWindowHandle();
		System.out.println(first.length());

		WebElement input = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		input.click();
		Actions act = new Actions(driver);

		act.moveToElement(input).sendKeys("Apple iPhone 13 Pro)").build().perform();

		act.moveToElement(input).sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath("//span[.='1,08,900']"));
		act.moveToElement(search).click().perform();

		Set<String> secdpage = driver.getWindowHandles();
		List<String> convert = new ArrayList<String>(secdpage);

		driver.switchTo().window(convert.get(1));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement cart = driver.findElement(By.xpath("(//span[.='Add to Cart'])[1]"));
		cart.click();

		Thread.sleep(2000);

	}

	@BeforeSuite()
	void end() {
		System.out.println("End of the program");
	}

	@AfterSuite()

	void last() {
		System.out.println("After Suit");
	}

}
