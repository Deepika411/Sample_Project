package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Practice\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    //driver.switchTo().frame(0);
    WebElement a=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
    a.click();
    //Thread.sleep(300);
    //WebElement b=driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
    //b.click();
    WebElement c=driver.findElement(By.className("_2zrpKA"));
    c.sendKeys("8608788053");
    //WebElement d=driver.findElement(By.xpath("//button[@type='submit']"));
    //d.click();
   
   





}
}
