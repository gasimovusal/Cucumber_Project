package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {

    public PaymentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[.='Complete Reservation'])[2]")
    public WebElement completeReservatioonText;
    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement carNumberBox;
    @FindBy(xpath = "//input[@name='nameOnCard']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@name='expireDate']")
    public WebElement expireDatBox;
    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvcBox;
    @FindBy(xpath = "//input[@name='contract']")
    public WebElement agreementBox;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement completeReservationButton;
    @FindBy(xpath = "//div[.='Reservation created successfully']")
    public WebElement successfullMessage;
}
