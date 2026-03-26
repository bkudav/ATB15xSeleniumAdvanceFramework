package org.example.tests.VWO;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.pageobjectmodel.VWO.DashboardPage;
import org.example.pageobjectmodel.VWO.LoginPage;
import org.example.pageobjectmodel.VWO.StartFreeTrial;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCase_VWO_login {
    //D
    //L
    //V

    @Owner("Bhagyashree Kudav")
    @Description("Verify positive login to VWO website")
    @Test
    public void TC01_postive_VWO_login()
    {
        //Driver Manager
        WebDriver driver = new ChromeDriver();
        {
            driver.get("https://app.vwo.com");
        }

        //L - POM code
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToVWOValidCreds("cxh04@tempumail.cc", "ILoveDrive#08");

        DashboardPage dashboardPage = new DashboardPage(driver);
        String userNameLoggedIn = dashboardPage.loggedInUserName();

        //V - Assertions
        Assert.assertEquals(userNameLoggedIn, "Kishore J");
        driver.quit();
    }
    @Owner("Bhagyashree Kudav")
    @Description("Verify negative login to VWO website")
    @Test
    public void TC02_negative_VWO_login()
    {
        WebDriver driver = new ChromeDriver();
        {
            driver.get("https://app.vwo.com");
        }

        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.loginToVWOInValidCreds("asr@gmail.com","1234");

        assertThat(error_msg).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Owner("Bhagyashree Kudav")
    @Description("Verify Free Trial page")
    @Test
    public void TC03_freeTrialVerify()
    {
        WebDriver driver = new ChromeDriver();
        {
            driver.get("https://vwo.com/free-trial");
        }
        StartFreeTrial startfreetrial = new StartFreeTrial(driver);
        startfreetrial.freeTrial("tfjg3y8uug@snapmail.site");
        driver.quit();
    }

}
