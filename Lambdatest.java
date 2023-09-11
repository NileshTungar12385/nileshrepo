package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lambdatest {
	@Test(priority=1)
	public void currenturl()
	{
		
	    	WebDriver driver = new ChromeDriver();
	     // String url = "https://www.lambdatest.com/selenium-playground/simple-form-demo";
	    //  driver.get(url);
	    	driver.get("https://www.lambdatest.com/selenium-playground");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     /* String strUrl = driver.getCurrentUrl();
	          String currenturl = driver.getCurrentUrl();
			  Assert.assertTrue(currenturl.contains("simple-form-demo"));
			  String message = "Welcome to LambdaTest";
	        driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys(message);
	        driver.findElement(By.id("showInput")).click();
	       String actualmsg= driver.findElement(By.id("message")).getText();
	        Assert.assertEquals(actualmsg,message);*/
	        driver.findElement(By.xpath("//a[contains(@class,'text-black text-size-14 hover:text')][text()='Drag & Drop Sliders']")).click();
	      WebElement slide =driver.findElement(By.xpath("//output[@id='rangeSuccess']/parent::div/input[@type='range']"));
	      Actions a = new Actions(driver);
	      a.clickAndHold(slide).moveByOffset(185,0).release().perform();
	  String count =   driver.findElement(By.xpath("//output[@id='rangeSuccess']")).getText();
	      Assert.assertEquals(count,"95");
	      
	   }
	
	}
	


