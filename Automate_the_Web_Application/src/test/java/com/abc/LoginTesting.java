package com.abc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTesting {
	private String driverPath="E:\\chromedriver.exe";
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  driver.get("https://www.facebook.com/login/");
      sleep(5000);
      
      driver.manage().window().maximize();
      sleep(5000);
      
      driver.findElement(By.id("email")).sendKeys("lisa@gmail.com");
      sleep(5000);
      driver.findElement(By.id("pass")).sendKeys("123456789");
      sleep(5000);
      
      
      driver.findElement(By.id("loginbutton")).click();
      
      WebElement errorMessage = driver.findElement(By.xpath("(//div[@class='_9ay7'])"));
		String expectedErrorMessage= "The password that you've entered is incorrect. Forgotten password?";
		String actualErrorMessage = errorMessage.getText();
		System.out.println(actualErrorMessage);
		
		
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),"Actual error message does not contain expected."
				+ "\nActual:" + actualErrorMessage + "\n Expected:" +expectedErrorMessage);
	  
	  
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
