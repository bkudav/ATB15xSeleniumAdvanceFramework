package org.example.pageobjectmodel.VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    //Driver Manager
    WebDriver driver;
    public SignUpPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Page Locators
    private By firstName = By.id("page-v1-fname");
    private By lastName = By.id("page-v1-lname");
    private By phoneNumber = By.id("page-v1-pnumber");
    private By signupSubmit = By.id("page-su-submit");

    //Page Actions
    public void createAccount()
    {
        driver.findElement(firstName).sendKeys("Tom");
        driver.findElement(lastName).sendKeys("Cruise");
        driver.findElement(phoneNumber).sendKeys("0567890123");
        driver.findElement(signupSubmit).click();
    }
}
