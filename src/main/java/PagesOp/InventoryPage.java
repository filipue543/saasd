package PagesOp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends basePage{
    @FindBy (id="remove-sauce-labs-backpack")
    WebElement backpack;

    @FindBy (id= "remove-sauce-labs-bike-light")
    WebElement bikelight;

    @FindBy (css = "#shopping")
    WebElement cart;
    public InventoryPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String Cart(){
        return cart.getText();
    }
    public void AddBackpack(){
        backpack.click();
    }
    public void AddBikeLight(){
        bikelight.click();
    }
}
