package org.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRM\\eclipse-workspace\\SeleniumDay1\\Driver File\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement ursename = driver.findElement(By.id("email"));
	ursename.sendKeys("9500145322");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("1236547");
	WebElement login = driver.findElement(By.name("login"));
		
	login.click();
		
		driver.quit();
		System.out.println("close the browser");
		
		
		
		
	}

}
