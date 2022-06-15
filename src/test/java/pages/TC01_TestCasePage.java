package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC01_TestCasePage {

    public TC01_TestCasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Signup / Login")
    public WebElement singupPage;
    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement signupNameBox;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement signupEmailBox;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUpButton;
    @FindBy(xpath = "(//b)[1]")
    public  WebElement accountInformationText;
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement title;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "days")
    public WebElement dob;
    @FindBy(id = "newsletter")
    public WebElement newsletterButton;
    @FindBy(id = "optin")
    public WebElement receiveOptionButton;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement createAccount;
    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;
    @FindBy(linkText = "Continue")
    public WebElement continueButton;
    @FindBy(xpath = "//b[.='James Battey']")
    public WebElement username;
    @FindBy(linkText = "Delete Account")
    public WebElement deleteAccount;
    @FindBy(xpath = "//h1[.='Delete Account']")
    public WebElement accountDeleteText;

}
