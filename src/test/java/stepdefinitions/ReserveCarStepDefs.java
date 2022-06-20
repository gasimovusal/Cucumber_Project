package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import utilities.Driver;

public class ReserveCarStepDefs {

    DefaultPage defaultPage = new DefaultPage();

    @When("user selects a {string}")
    public void user_selects_a(String car) {
        Select select = new Select(defaultPage.select_car);
        select.selectByVisibleText(car);
    }
    @When("user enters pick up place {string}")
    public void user_enters_pick_up_place(String place) {
        Driver.waitAndSendText(defaultPage.pick_place,place);
    }

    @When("user enters drop off place {string}")
    public void user_enters_drop_off_place(String string) {
        Driver.waitAndSendText(defaultPage.drop_place,string);
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
//       defaultPage.continueReservationButton.click();
        Driver.waitAndClick(defaultPage.continueReservationButton);
    }
    @Then("verify complete reservation screen pop up")
    public void verify_complete_reservation_screen_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user enters card number {string}")
    public void user_enters_card_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user enters {string} on the card")
    public void user_enters_on_the_card(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user checks the agreement")
    public void user_checks_the_agreement() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks complete reservation")
    public void user_clicks_complete_reservation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify Reservation created successfully pop up")
    public void verify_reservation_created_successfully_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
