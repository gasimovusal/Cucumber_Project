package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC22_TestCasePage {

    public TC22_TestCasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement recommendedItemsText;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[73]")
    public WebElement winterTop;
    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//*[text()='Winter Top']")
    public WebElement verifyWinterTop;

}
