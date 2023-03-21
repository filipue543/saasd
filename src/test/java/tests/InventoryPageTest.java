package tests;

import PagesOp.InventoryPage;
import PagesOp.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseTest {
    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void Before() {
        driver = openWebDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void Buy2Product() {
        loginPage.Login("standard_user", "secret_sauce");
        inventoryPage.AddBackpack();
        inventoryPage.AddBikeLight();
        Assert.assertEquals(inventoryPage.Cart(),"2");

    }

    @AfterMethod
    public void After() {

        driver.quit();
    }
}
