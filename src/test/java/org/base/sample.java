package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;*/

public class sample extends baseclass {
	public static void main(String[] args) {
		/*
		 * //to configure driver WebDriverManager.chromedriver().setup(); //object for
		 * webdriverI-upcasting WebDriver driver=new ChromeDriver();
		 */


		WebDriver driver2 = browserlaunch();
		launchurl("https://www.facebook.com/");
		pagetitle();
		maxbrowser();
		geturl();
		WebElement txtemail = driver2.findElement(By.id("email"));
		fill(txtemail, "greens@gmail.com");
		WebElement txtpass = driver2.findElement(By.id("pass"));
		fill(txtpass, "greens");
		WebElement clicklogin = driver2.findElement(By.name="login");
		clicklogin.click();

	}

}
