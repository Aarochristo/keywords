package fblogin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.thread.ThreadTimeoutException;

public class AssetVerify {

	WebDriver driver;

	long startTime;
	long endtime;
	long totaltime;

	private boolean WebElement;

	@BeforeMethod()
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		startTime = System.currentTimeMillis();
	}

	/*
	 * @Test
	 * 
	 * void asserts() throws InterruptedException {
	 * 
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * Thread.sleep(2000);
	 * 
	 * driver.get("https://www.helpsystems.com/"); WebElement asser1 =
	 * driver.findElement(By.xpath("(//div[@class='row']//following::a)[1]"));
	 * String s = asser1.getText();
	 * 
	 * String asser2 = "HOW WE HELP";
	 * 
	 * Assert.assertEquals(s, asser2);
	 * System.out.println("after assertion print succesfully");
	 * 
	 * SoftAssert xample = new SoftAssert();
	 * 
	 * xample.fail(); System.out.println("after soft assertion fails");
	 * 
	 * driver.quit();
	 * 
	 * }
	 * 
	 * 
	 * @Test(dependsOnMethods ="asserts")
	 * 
	 * void Repeat() {
	 * 
	 * 
	 * System.out.println("Repeat it 3 times"); driver.quit(); }
	 */

	// @Test(timeOut=5000,expectedExceptions=ThreadTimeoutException.class)

	@Test
	void loop() {
		driver.get("https://www.sportskeeda.com/");
		driver.manage().window().maximize();

		/*
		 * Alert swt=driver.switchTo().alert(); swt.dismiss();
		 */

		List<WebElement> player = driver.findElements(By.xpath("//select[@id='hp_feed_select']//following::option"));

		System.out.println("whats in the index of 5" + player);

		for (WebElement indian : player) {

			System.out.println("   *   " + indian.getText());

		}

		System.out.println("single" + player.get(5).getText());

		System.out.println("get text" + player.size());

		if (player.size() == 9) {
			System.out.println("printed successfully");

		} else {
			System.out.println("not working ");
		}

		System.out.println("is it empty or not   " + player.isEmpty());

	}

	@Test(invocationCount = 2)
	void end() {
		endtime = System.currentTimeMillis();

		totaltime = endtime - startTime;
		System.out.println("total amount of time   " + totaltime);
		driver.quit();
	}

}
