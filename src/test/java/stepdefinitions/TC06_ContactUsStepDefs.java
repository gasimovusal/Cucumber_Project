package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC06_ContactUsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06_ContactUsStepDefs {

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    TC06_ContactUsPage contactUsPage = new TC06_ContactUsPage();
    @When("user clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() {
        contactUsPage.contactUsButton.click();
    }
    @Then("user verifies GET IN TOUCH is visible")
    public void user_verifies_get_in_touch_is_visible() {
        Assert.assertTrue(contactUsPage.getInTouch.isDisplayed());
    }
    @Then("user enters name, email, subject and message")
    public void user_enters_name_email_subject_and_message() {
        actions.click(contactUsPage.nameBox).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys("Need help with payment")
                .sendKeys(Keys.TAB).sendKeys("Payment does not go through").perform();
    }
    @Then("user uploads file")
    public void user_uploads_file() {

        String filePath = "/Users/VG/Desktop/Views/dumbo.jpeg";
        contactUsPage.uploadFileButton.sendKeys(filePath);
    }
    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        Driver.waitAndClick(contactUsPage.submitButtton);
    }
    @Then("user clicks OK button")
    public void user_clicks_ok_button() {
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("user verifies success message Success! Your details have been submitted successfully. is visible")
    public void user_verifies_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(contactUsPage.successMessage.isDisplayed());
    }
    @Then("user clicks Home button and verify that landed to home page successfully")
    public void user_clicks_home_button_and_verify_that_landed_to_home_page_successfully() {
        contactUsPage.homeButton.click();
    }
}
