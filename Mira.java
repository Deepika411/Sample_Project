package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mira {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Practice\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://toolsqa.com/automation-practice-table/");
List<WebElement> rows = driver.findElements(By.tagName("tr"));
for (int i = 0; i < rows.size(); i++) {
WebElement r = rows.get(i);
List<WebElement> data = r.findElements(By.tagName("td"));
for (int j = 0; j < data.size(); j++) {
	WebElement d = data.get(j);
	System.out.println(d.getText());
}
}
}
}
