package fblogin;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class looptry 
{


	public static void main(String args[]) throws InterruptedException 

	{
		
		try
		{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.canva.com/");
		
		
		//----------------getting the pagesource ----------------------
          
          
          String pagesourcecode= driver.getPageSource();
        System.out.println(pagesourcecode+"\n");
          Thread.sleep(2000);
          
        driver.findElement(By.xpath("//button[@id='__a11yId6']")).click();
        
        
        
       // --------------------for getting list of text inside the tag-----------------
        
        
        List<WebElement> tab =driver.findElements(By.xpath("//li[@role='none']"));
        
      WebElement a;
        
        
        for(int i=0;i<tab.size();i++)
        {
        	a=tab.get(i);
        	System.out.print(a.getText().toUpperCase()+"\n");
        	  
        	

        	
        }
        System.out.println("\n");
        
        
        driver.findElement(By.id("__a11yId6")).click();
        
        
        List<WebElement> tabss =driver.findElements(By.xpath("//span[.='Features']") );
        
        Iterator<WebElement> it = tabss.iterator();
        while(it.hasNext())
        	{
        	  System.out.println(it.next());
              
        }


       
        
        
        List<WebElement> totalframesS =driver.findElements(By.tagName("input"));

		int size = totalframesS.size();
		System.out.println(size+"\n");  
	
	
	}
	catch(Exception t)
	{
		System.out.println("if any error"+   t);
	}
}
}
		

          
          
          
          
          
          
          