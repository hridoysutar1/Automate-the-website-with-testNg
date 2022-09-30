package com.abc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SearchBar {
	private String driverPath="E:\\chromedriver.exe";
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	 WebElement ele= driver.findElement(By.name("q"));
	 ele.sendKeys("selenium book");
		ele.sendKeys(Keys.RETURN);
		
		
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}