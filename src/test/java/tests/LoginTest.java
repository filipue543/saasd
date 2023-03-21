package tests;

import PagesOp.LoginPage;
import PagesOp.StringPar;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class LoginTest extends BaseTest {
    ChromeDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void SetUp() {
        driver = openWebDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginWithValidData() {
        loginPage.Login(StringPar.Valid_User_Name, StringPar.Valid_Password);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginWithNoValidData() {
        loginPage.Login(StringPar.No_Valid_User_Name, StringPar.Valid_Password);
        Assert.assertEquals(loginPage.getTextMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @AfterMethod
    public void After() {

        driver.quit();
    }
}
