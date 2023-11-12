package com.pageobject.mavenproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
//locators
By username=By.id("login-username");
By password=By.id("login-password");
By signButton=By.id("js-login-btn");

//Generic Method

//1.Initialise driver
public void navigateTourl(String url) {
	driver.get(url);
	
}
public void writeToElement(By element,String text) {
	driver.findElement(element).sendKeys(text );
}
public void clickOnElement(By element) {
	driver.findElement(element).click();
}
public void loginTovwo(String username_text,String password_text) {
	writeToElement(username, username_text);
	writeToElement(password, password_text);
	clickOnElement(signButton);
}

}
