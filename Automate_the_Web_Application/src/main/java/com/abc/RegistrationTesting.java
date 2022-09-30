package com.abc;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RegistrationTesting {
	
	private String driverPath="E://chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("https://www.facebook.com/reg/");
		sleep(5000);
		
		driver.manage().window().maximize();
		sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Lisa");
		

		driver.findElement(By.name("lastname")).sendKeys("Karter");
		sleep(2000);

		driver.findElement(By.name("reg_email__")).sendKeys("lisa123@mail.com");
		

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("lisa123@mail.com");
		sleep(2000);

		driver.findElement(By.id("password_step_input")).sendKeys("klasdjf3214");

		driver.findElement(By.id("day")).sendKeys("1");

		driver.findElement(By.id("month")).sendKeys("Jan");

		driver.findElement(By.id("year")).sendKeys("2001");
		sleep(2000);

		driver.findElement(By.className("_8esa")).click();
		sleep(2000);

		driver.findElement(By.name("websubmit")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }
  private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
