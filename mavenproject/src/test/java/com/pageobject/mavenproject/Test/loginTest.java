package com.pageobject.mavenproject.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.mavenproject.LoginPage;

public class loginTest {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		LoginPage lp=new LoginPage(dr);
		lp.navigateTourl("https://app.vwo.com");
		lp.loginTovwo("lipak300@gmail.com", "Lipak31@1993");
		System.out.println("the act text is"+dr.getCurrentUrl());
		Assert.assertTrue(dr.getCurrentUrl().equalsIgnoreCase("login"));
		System.out.println("the act text is"+dr.getCurrentUrl());
	}

}
