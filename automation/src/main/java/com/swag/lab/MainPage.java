package com.swag.lab;

import com.abstact.AbstactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends AbstactPage {
    
    public final static By titleProducts = By.xpath("//div[contains(@class,'header_secondary')]//span[@class='title']");

    public MainPage(WebDriver driver){
        super(driver);
    }

    public String getTitlePageText() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(titleProducts));
        String title_text = getDriver().findElement(titleProducts).getText();
        return title_text; 
    }

}
