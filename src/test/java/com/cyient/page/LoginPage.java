package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	private By usernameLoc = By.id("authUser");
	private By passwordLoc=By.id("clearPass");
	private By lanaguageLoc=By.name("languageChoice");
	private By loginLoc=By.xpath("//button[@type='submit']");
	private By errorLoc=By.xpath("//div[contains(text(),'Invalid')]");

	private WebDriver driver;
	
	//driver

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {
		driver.findElement(usernameLoc).sendKeys(username);
	}

	public void sendPassword(String password) {
		driver.findElement(passwordLoc).sendKeys(password);
	}
	
	public void selectLanaguageByText(String langaugeText)
	{
		Select selectLanguage = new Select(driver.findElement(lanaguageLoc));
		selectLanguage.selectByVisibleText(langaugeText);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(loginLoc).click();
	}
	
	
	public String getErrorMessage()
	{
		return driver.findElement(errorLoc).getText().trim();
	}
}



