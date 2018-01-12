package SeleniumTest.LoginTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ToolQALogin {
    
	public static WebDriver driver = null;
	
	@Test
    public  void LoginTest() {
    //driver = new FirefoxDriver();
    	System. setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver.exe");
    	// Initialize browser.
    	WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.store.demoqa.com");

    driver.findElement(By.xpath(".//*[@id='account']/a")).click();
    driver.findElement(By.id("log")).sendKeys("abcdefgh"); 
    driver.findElement(By.id("pwd")).sendKeys("123456");
    driver.findElement(By.id("login")).click();
    //String val = driver.findElement (By.xpath("/html/body/div[2]/div/div/div/div/div[1]/article/div/div/div/div[1]/form/p[1]")).getAttribute();
    driver.quit();
        }
}