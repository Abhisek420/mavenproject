package PageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {
WebDriver dr;

public LoginPagePF(WebDriver dr) {
	
	this.dr = dr;
	PageFactory.initElements(dr, this);
}
@FindBy(id="login-username")
WebElement username;
@FindBy(id="login-password")
WebElement password;
@FindBy(id="js-login-btn")
WebElement signButton;

public void navigateTourl(String url) {
	dr.get(url);
	
}
public void writeToElement(WebElement element,String text) {
element.sendKeys(text );
}
public void clickOnElement(WebElement element) {
	element.click();
}
public void loginTovwo(String username_text,String password_text) {
	writeToElement(username, username_text);
	writeToElement(password, password_text);
	clickOnElement(signButton);
}




}
