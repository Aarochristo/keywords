package fblogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
	public static void main(String args[]) throws InterruptedException {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ui.vision/demo/webtest/frames/");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.switchTo().frame(0);

			WebElement frame = driver.findElement(By.xpath("//input[@name=\'mytext1\']"));
			frame.sendKeys("Frame 1 completed");

			driver.switchTo().defaultContent();

			driver.switchTo().frame(1);
			WebElement frame1 = driver.findElement(By.xpath("//input[@name='mytext2']"));
			frame1.sendKeys("Frame 2 completed");

			driver.switchTo().defaultContent();
			Thread.sleep(1000);

			driver.switchTo().frame(2);
			
			WebElement frame2 = driver.findElement(By.xpath("//input[@name='mytext3']"));
			frame2.sendKeys("Frame 3 completed");

			driver.switchTo().defaultContent();
			Thread.sleep(1000);

			driver.switchTo().frame(2).switchTo().frame(0);

			WebElement frame3 = driver.findElement(By.xpath("//div[@id='i5']"));
			frame3.click();
			Thread.sleep(2000);
			WebElement frame3c = driver.findElement(By.xpath("//div[@id='i19']"));
			frame3c.click();
			Thread.sleep(2000);
			WebElement frame3cc = driver.findElement(By.xpath("//span[.='Choose']"));
			frame3cc.click();

			Actions act = new Actions(driver);

			act.scrollByAmount(0, 400);
			Thread.sleep(2000);

			WebElement fra = driver.findElement(By.xpath("//div[@role='option' and contains(.,'Yes')]"));
			fra.click();

			driver.switchTo().parentFrame();

			driver.switchTo().defaultContent();

			Thread.sleep(1000);

			driver.switchTo().frame(3);
			WebElement frame4 = driver.findElement(By.name("mytext4"));
			frame4.sendKeys("Frame 4 completed");

			driver.switchTo().defaultContent();
			Thread.sleep(1000);

			// print the number of frame tag

			List<WebElement> totalframesS = driver.findElements(By.tagName("frames"));

			int size = totalframesS.size();
			System.out.println("total number of button tags" + size);
			driver.close();

		} catch (Exception e)

		{
			System.err.println("error found in it" + e);
		} finally {
			System.out.println("everythig has done");
		}
	}

}
