package org.example.base;

import org.example.utils.ProperiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.driver.DriverManager.getDriver;

public class CommonToAllPage {
    // Common to All Pages
    public void openVWOUrl()
    {
        getDriver().get(ProperiesReader.readKey("url"));
    }
    public void openOrangeHRMUrl(){
        getDriver().get(ProperiesReader.readKey("ohr_url"));
    }

    public void openKatalonUrl(){
        getDriver().get(ProperiesReader.readKey("katalon_url"));
    }
    public void clickElement(By by)
    {
        getDriver().findElement(by).click();
    }
    public void enterInput(By by,String key)
    {
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement by){
        return by.getText();
    }

}
