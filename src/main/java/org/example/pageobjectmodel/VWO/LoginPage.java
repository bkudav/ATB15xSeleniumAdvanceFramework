package org.example.pageobjectmodel.VWO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    //Driver
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Page Class


    //Page Locator
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signin = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    //Actions
    public void loginToVWOValidCreds(String user, String pwd)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signin).click();

    }

    public String loginToVWOInValidCreds(String user, String pwd)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signin).click();
        org.example.utils.WaitHelpers.checkVisibility(driver,error_message);
        String error_message_text = driver.findElement(error_message).getText();
        return error_message_text;
    }
}
