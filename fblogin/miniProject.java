package fblogin;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class miniProject {

	void mini() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.navigate().to("https://www.tcs.com/");

			// FIRST ONE ----------------------------------

			String lo = driver.getWindowHandle();

			WebElement pop = driver.findElement(By.xpath("//button[.='Accept All Cookies']"));
			pop.click();

			// Alert tcspopup=driver.switchTo().alert();
			// tcspopup.accept();

			JavascriptExecutor jsee = (JavascriptExecutor) driver;
			jsee.executeScript("window.scrollBy(0, 1500)");

			WebElement pop1 = driver.findElement(By.xpath("(//a[contains(.,'Careers')])[1]"));
			pop1.click();
			Thread.sleep(3000);

			WebElement pop2 = driver.findElement(By.xpath("//li[.=' Asia ']//following::li[.='India']"));
			pop2.click();
			Thread.sleep(3000);

			JavascriptExecutor jseee = (JavascriptExecutor) driver;
			jseee.executeScript("window.scrollBy(0, 1500)");

			List<WebElement> add = driver.findElements(
					By.xpath("//div[@id='footer-menu-industries']//following::div[@class='footer-menu'][1]"));
			Thread.sleep(2000);

			for (WebElement printall : add) {

				System.out.println(printall.getSize() + printall.getText().toUpperCase());
				System.out.println(
						"--------------------------------------------------------------------------------------");

			}

			List<WebElement> re = driver.findElements(
					By.xpath("//div[@class='footer-column service']//following::div[@class='footer-menu'][1]"));

			Iterator<WebElement> itt = re.iterator();
			while (itt.hasNext()) {
				System.out.println(itt.next().getText());
			}

			WebElement adds = driver.findElement(By.xpath("(//a[.='Login'])[1]"));
			adds.click();

			Thread.sleep(3000);

			WebElement addss = driver.findElement(By.xpath("//a[@class='prompt-ok']"));
			addss.click();

			Set<String> allwindows = driver.getWindowHandles();

			List<String> all = new ArrayList<String>(allwindows);

			driver.switchTo().window(all.get(1));

			WebElement a = driver.findElement(By.xpath("//input[@type='password']//preceding::input[@type='text']"));
			a.sendKeys("AARON CHRIS");
			WebElement aa = driver.findElement(By.xpath("//input[@type='password']"));
			aa.sendKeys("correctaahh irukaa");
			WebElement aaa = driver.findElement(By.xpath("//input[@type='checkbox']"));
			aaa.click();

			Thread.sleep(3000);
			WebElement t = driver.findElement(By.linkText("Partner"));
			t.click();

			WebElement f = driver.findElement(By.id("dropState"));

			Select drop = new Select(f);

			drop.selectByIndex(2);

			Thread.sleep(3000);

			drop.selectByValue("10");
			Thread.sleep(3000);
			drop.selectByVisibleText("Goa");
			Thread.sleep(3000);

			WebElement ab = driver
					.findElement(By.xpath("(//table[@class='contenttable']//ancestor::td//td[@class='pagetitle'])[2]"));
			ab.getText();

			System.out.println(ab.getText());

			List<WebElement> ee = drop.getOptions();
			int size = ee.size();
			System.out.println("How Many States are in this DropDown   :" + size);

			f.sendKeys("Tamil Nadu");

			//driver.close();

			driver.switchTo().window(all.get(0));
			
			//Thread.sleep(4000);

			WebElement intsa = driver.findElement(By.xpath("//a[@title='Instagram']"));
			
			intsa.click();

			Set<String> inswind = driver.getWindowHandles();
			

			List<String> al = new ArrayList<String>(inswind);
			
			System.out.println(al.size());

			driver.switchTo().window(al.get(2));
		/*	
			System.out.println("ithu vara ok");

			WebElement intsaag = driver.findElement(By.xpath("//span[@aria-label='Close']"));
			intsaag.click();
			System.out.println("ithu vara ok");

			// WebElement in= driver.findElement(By.xpath("//input[@aria-label='Search
			// input']"));in.sendKeys("aaronchrizz");

			// Thread.sleep(2000);

			TakesScreenshot edu = (TakesScreenshot) driver;

			File save = edu.getScreenshotAs(OutputType.FILE);
			File location = new File("D://aaron.png");
			FileHandler.copy(save, location);
			
			Thread.sleep(2000);
			
			driver.navigate().back();

			driver.navigate().refresh();
			//Thread.sleep(2000);

			// WebElement rone=
			// driver.findElement(By.xpath("(//div[.='R1'])[2]"));rone.click();

			
			String ss = driver.getCurrentUrl();
			System.out.println("Title for this Current Url:    " + ss);
			System.out.println();

			System.out.println("Length of the URL:    " + ss.length());
			System.out.println();

			System.out.println("How many Windows are working Currently:    " + allwindows.size());
			System.out.println();

			Thread.sleep(2000);
			
			List<WebElement> totalframesS = driver.findElements(By.tagName("frames"));

			int sizes = totalframesS.size();
			System.out.println("total number of button tags" + sizes);

			driver.quit();

			// WebElement
			// sst=driver.findElement(By.xpath("//div[@id='search-icon-container']"));sst.click();
			// Thread.sleep(2000);

			//WebElement From = driver.findElement(By.xpath("//a[@title='Facebook']"));

			//WebElement to = driver.findElement(By.id("search-box"));

			//Actions action = new Actions(driver);

			//action.clickAndHold(From).moveToElement(to).release().build().perform();

			
*/
		} catch (Exception r) {
			System.out.println("find error" + r);
		}

		finally {
			System.out.println("Testing completed");
		}
	}

}
