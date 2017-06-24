// load the webpage using chrome driver...

System.out.println("launching chrome browser");
System.setProperty("webdriver.chrome.driver", "D:\\selenium_sumit\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();	    
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.navigate().to("https://www.google.com/");	    
driver.manage().window().maximize();  // maximize window


package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewDemo {
	
	public static WebDriver driver;	
	
	public static void main (String arg[]){
		
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_sumit\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.google.com/");	    
	    driver.manage().window().maximize();  // maximize window
		
	    //  //*[@id="lst-ib"]
	  
	    driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("facebook");
	    driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
	   // driver.findElement(By.xpath("//*[@id='_fZl']/span/svg")).click();
	    //Create explicit wait.
		WebDriverWait myWait = new WebDriverWait(driver, 10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")));

	    driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();	
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("7205686166");	
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("ii");	
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();	
	    
	    
	  
	  
	  
	    
		
	}
	

}
