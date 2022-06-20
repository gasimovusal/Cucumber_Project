package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.PaymentPage;
import pages.ReservationPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class ReserveCarStepDefs {

    DefaultPage defaultPage = new DefaultPage();
    PaymentPage paymentPage = new PaymentPage();
    ReservationPage reservationPage = new ReservationPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user selects a {string}")
    public void user_selects_a(String car) {
        Select select = new Select(defaultPage.select_car);
        select.selectByVisibleText(car);
    }
    @When("user enters pick up place {string}")
    public void user_enters_pick_up_place(String place) {
        Driver.waitAndSendText(defaultPage.pick_place,place);
//        defaultPage.bostonMa.click();
    }
    @When("user enters drop off place {string}")
    public void user_enters_drop_off_place(String string) {
        Driver.waitAndSendText(defaultPage.drop_place,string);
//        Select select = new Select(defaultPage.listOfOptions);
//        select.getAllSelectedOptions()
    }
    @And("user enters pick up data {string}")
    public void userEntersPickUpData(String string) {
        Driver.waitAndSendText(defaultPage.pick_date,string);
    }
    @When("user enters pick up time {string}")
    public void user_enters_pick_up_time(String string) {
//        Driver.waitAndSendText(defaultPage.pick_time,string);
//   both of them are OK
        defaultPage.pick_time.sendKeys(string);
    }

    @When("user enters drop off date {string}")
    public void user_enters_drop_off_date(String string) {
        Driver.waitAndSendText(defaultPage.drop_date,string);
    }

    @When("user enters drop off time {string}")
    public void user_enters_drop_off_time(String string) {
        Driver.waitAndSendText(defaultPage.drop_time,string);
    }

    @Then("user clicks on continue reservation")
    public void user_clicks_on_continue_reservation() {
       defaultPage.continueReservationButton.click();
//        Driver.waitAndClick(defaultPage.continueReservationButton);
    }
    @Then("verify complete reservation screen pop up")
    public void verify_complete_reservation_screen_pop_up() {
        Assert.assertTrue(paymentPage.completeReservatioonText.isDisplayed());
    }
    @Then("user enters card number {string}")
    public void user_enters_card_number(String string) {
        actions.moveToElement(paymentPage.carNumberBox).click().sendKeys(Keys.HOME).sendKeys(string).build().perform();
    }
    @Then("user enters {string} on the card")
    public void user_enters_on_the_card(String string) {
        actions.moveToElement(paymentPage.nameBox).click().sendKeys(Keys.HOME).sendKeys(string).build().perform();
    }
    @Then("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        actions.moveToElement(paymentPage.expireDatBox).click().sendKeys(Keys.HOME).sendKeys(string)
                .sendKeys(Keys.TAB).moveToElement(paymentPage.cvcBox).click().sendKeys(Keys.HOME).sendKeys(string2).build().perform();
    }
    @Then("user checks the agreement")
    public void user_checks_the_agreement() {
        paymentPage.agreementBox.click();
    }
    @Then("user clicks complete reservation")
    public void user_clicks_complete_reservation() {
        paymentPage.completeReservationButton.click();
    }
    @Then("verify Reservation created successfully pop up")
    public void verify_reservation_created_successfully_pop_up() {
        Assert.assertTrue(paymentPage.successfullMessage.isDisplayed());
    }
    @Then("user navigated to Reservations screen")
    public void user_navigated_to_reservations_screen() {
        Driver.waitAndClick(reservationPage.accountDropdown);
        reservationPage.reservationsButton.click();
    }
    @And("user verifies the last reservation is created")
    public void userVerifiesTheLastReservationIsCreated() {
        Assert.assertTrue(reservationPage.reservedCar.isDisplayed());
    }
    @Then("user clicks on the last reservation")
    public void user_clicks_on_the_last_reservation() {
        reservationPage.lastAddedCar.click();
    }
    @Then("verify reservation detail page is displayed")
    public void verify_reservation_detail_page_is_displayed() {
        Assert.assertTrue(reservationPage.reservationDetailText.isDisplayed());
    }
    @Then("verify the table has the following fields: Model, Doors, Seats, Luggage, Transmission, Air Conditioning, Fuel Type, Age")
    public void verify_the_table_has_the_following_fields_model_doors_seats_luggage_transmission_air_conditioning_fuel_type_age() {
        reservationPage.carDetails.click();
        Assert.assertTrue(reservationPage.modelField.isDisplayed());
        Assert.assertTrue(reservationPage.doorsField.isDisplayed());
        Assert.assertTrue(reservationPage.seatsField.isDisplayed());
        Assert.assertTrue(reservationPage.luggageField.isDisplayed());
        Assert.assertTrue(reservationPage.transmissionField.isDisplayed());
        Assert.assertTrue(reservationPage.airConditioningField.isDisplayed());
        Assert.assertTrue(reservationPage.fuelTypeField.isDisplayed());
        Assert.assertTrue(reservationPage.ageField.isDisplayed());
    }
    @Then("user clicks on back to reservations")
    public void user_clicks_on_back_to_reservations() {
        reservationPage.backToReservButton.click();
    }
    @Then("verify Reservations page is displayed")
    public void verify_reservations_page_is_displayed() {
       Assert.assertTrue(reservationPage.reservationsText.isDisplayed());
    }
    @Then("user clicks on Home link")
    public void user_clicks_on_home_link() {
        reservationPage.homePage.click();
    }
    @Then("verify the home page is displayed")
    public void verify_the_home_page_is_displayed() {
        Assert.assertEquals("https://www.bluerentalcars.com/", Driver.getDriver().getCurrentUrl());
    }


}
