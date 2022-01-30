package com.swag.lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SwagLabTest {
    
    private WebDriver driver;

    private final String USERNAME = "performance_glitch_user";
    private final String PASSWORD = "secret_sauce";

    @BeforeEach
    public void initDriver() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void checkAuthorization() {
        // authorization step
        AuthorizationPage authorPage = new AuthorizationPage(driver);
        authorPage.loadPage();
        authorPage.authorization(USERNAME, PASSWORD);

        // get actual result step
        MainPage mainPage = new MainPage(driver);
        String actual = mainPage.getTitlePageText();

        // check step
        String expected = "PRODUCTS";
        assertEquals(expected, actual);
    }
}
