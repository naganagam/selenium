package org.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver,chrome.driver", "D:\\Driver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		
		WebElement at = driver.findElement(By.name("alertbox"));
		at.click();
		Alert alert1 = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert1.accept();
		
		WebElement confirmAlert = driver.findElement(By.name("confirmalertbox"));
		confirmAlert.click();
		Alert alert2 = driver.switchTo().alert();
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println(alertMessage2);
		alert2.dismiss();
		
		WebElement promptAlert = driver.findElement(By.name("promptalertbox1234"));
		promptAlert.click();
		Alert alert3 = driver.switchTo().alert();
		String alertMessage3 = driver.switchTo().alert().getText();
		System.out.println(alertMessage3);
		alert3.sendKeys("yes");
		alert3.accept();

		
	}

}
