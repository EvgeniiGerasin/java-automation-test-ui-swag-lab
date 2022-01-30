package com.swag.lab;

import com.abstact.AbstactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthorizationPage extends AbstactPage{

    // locators
    public final static By fieldUsername = By.xpath("//input[@id='user-name']");
    public final static By fieldPassword = By.xpath("//input[@id='password']");
    public final static By buttonLogin = By.xpath("//input[@name='login-button']");

    public AuthorizationPage(WebDriver driver){
        super(driver);
    }

    public void loadPage() {
        getDriver().get("https://www.saucedemo.com/");
    }

    public void authorization(String username, String password) {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(fieldUsername));
        getDriver().findElement(fieldUsername).sendKeys(username);
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(fieldPassword));
        getDriver().findElement(fieldPassword).sendKeys(password);
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(fieldPassword));
        getDriver().findElement(buttonLogin).click();
    }




    
}
