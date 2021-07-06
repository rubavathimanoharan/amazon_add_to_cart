package com.selenium.amaz;




import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazontest {
	
		
		WebDriver driver=null;
		
	
		
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubav\\eclipse-workspace\\Seleniumpro\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@AfterMethod
	    public void closeBrowser()
		{
	    	driver.quit();
		}
		
		
		@Test
		public void amazonsign() {
	
		//open amazon 
		driver.get("https://www.amazon.com/");
		
		//verify page title
		String pageTitle= driver.getTitle();
		Assert.assertEquals(pageTitle, "Amazon.com. Spend less. Smile more.");
		System.out.println(pageTitle);
		
		//click sign-in button
		WebElement signin= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		signin.click();
		
		
		//verify sign-in page title
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		
		//insert username and click continue
		WebElement usern= driver.findElement(By.xpath("//input[@name='email']"));
		usern.sendKeys("916369265696");
		WebElement cont= driver.findElement(By.id("continue"));
		cont.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//insert pwd and click signin
		WebElement pwd= driver.findElement(By.id("ap_password"));
		pwd.sendKeys("ruba2808");
		WebElement authsign= driver.findElement(By.id("auth-signin-button"));
		authsign.click();
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//Searching
				WebElement srchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
				srchbox.sendKeys("sony tv");
				
				//clicking and printing searchresult
				WebElement srchresult = driver.findElement(By.xpath("//*[@id=\"issDiv0\"]"));
				srchresult.click();
				System.out.println("SearchResult title is : " + srchresult);
				
				driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
				
				
				
			/*	//Switching selenium to new windowTab
				Set<String> windowIds = driver.getWindowHandles();
				Iterator<String> itr = windowIds.iterator();
				String mainpageid = itr.next();
				String Jobpageid = itr.next();
				
				driver.switchTo().window(Jobpageid);*/
			
				//adding product to cart
				WebElement addTocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
				addTocart.click();
				System.out.println(addTocart);
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
