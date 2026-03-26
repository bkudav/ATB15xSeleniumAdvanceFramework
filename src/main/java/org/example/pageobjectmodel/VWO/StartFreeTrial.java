package org.example.pageobjectmodel.VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartFreeTrial {

    //Driver Manager
    WebDriver driver;
    public StartFreeTrial(WebDriver driver)
    {
        this.driver = driver;
    }

    //Page Locators
    private By businessEmail = By.id("page-v1-step1-email");
    private By checkbox = By.id("page-free-trial-step1-cu-gdpr-consent-checkbox");
    private By submit = By.xpath("//button[text()='Create a Free Trial Account']");
    //private By startAFreeTrial = By.xpath("//span[text()='Start a FREE TRIAL']");


    //Actions
    public void freeTrial(String email)
    {
        driver.findElement(businessEmail).sendKeys(email);
        driver.findElement(checkbox).click();
        driver.findElement(submit).click();
        //driver.findElement(startAFreeTrial).click();
    }
}
