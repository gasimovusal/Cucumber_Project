package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC06_ContactUsPage {

    public TC06_ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Contact us")
    public WebElement contactUsButton;
    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouch;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFileButton;
    @FindBy(xpath = "//input[@class='btn btn-primary pull-left submit_form']")
    public WebElement submitButtton;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;
    @FindBy(linkText = "Home")
    public WebElement homeButton;

}
