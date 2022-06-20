package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReservationPage {

    public ReservationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement accountDropdown;
    @FindBy(linkText = "Reservations")
    public WebElement reservationsButton;
    @FindBy(xpath = "//tr[@class='cursor-hand']")
    public WebElement reservedCar;
    @FindBy(xpath = "(//tr[@class='cursor-hand'])[1]")
    public WebElement lastAddedCar;
    @FindBy(xpath = "//h1")
    public WebElement reservationDetailText;
    @FindBy(xpath = "//button[.='Car Details']")
    public WebElement carDetails;
    @FindBy(xpath = "//td[.='Model']")
    public WebElement modelField;
    @FindBy(xpath = "//td[.='Doors']")
    public WebElement doorsField;
    @FindBy(xpath = "//td[.='Seats']")
    public WebElement seatsField;
    @FindBy(xpath = "//td[.='Luggage']")
    public WebElement luggageField;
    @FindBy(xpath = "//td[.='Transmission']")
    public WebElement transmissionField;
    @FindBy(xpath = "//td[.='Air Conditioning']")
    public WebElement airConditioningField;
    @FindBy(xpath = "//td[.='Fuel Type']")
    public WebElement fuelTypeField;
    @FindBy(xpath = "//td[.='Age']")
    public WebElement ageField;
    @FindBy(xpath = "//button[.=' Back to reservations']")
    public WebElement backToReservButton;
    @FindBy(xpath = "//h1[.='Reservations']")
    public WebElement reservationsText;
    @FindBy(linkText = "Home")
    public WebElement homePage;
}
