package com.abc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AdddToKart {
	private String driverPath="E:\\chromedriver.exe";
	WebDriver driver;
  @Test
  public void addToKart() {
	  
	  
	  
	  driver.manage().window().maximize();

	  driver.get("https://www.flipkart.com/absolute-beginner-part-1-java-4-selenium-webdriver/p/itmf8uu5aaajwdy2?pid=9781530408368&lid=LSTBOK9781530408368HMZBCR&marketplace=FLIPKART&q=Selenium+book&store=bks&srno=s_1_1&");
	  driver.findElement(By.xpath("(//button[contains(.,'ADD TO CART')])")).click();
	  
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
