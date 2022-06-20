package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TC01_TestCasePage;
import utilities.Driver;

public class TC01_SignupStepDefs {

    TC01_TestCasePage testCasePage = new TC01_TestCasePage();
    Actions actions = new Actions(Driver.getDriver());
    Select dob;
    Faker faker = new Faker();

    @Then("user navigates to signup page")
    public void user_navigates_to_signup_page() {
        testCasePage.singupPage.click();
    }
    @Then("user verifies New User Signup! is visible")
    public void user_verifies_new_user_signup_is_visible() {
        Assert.assertTrue(testCasePage.newUserSignup.isDisplayed());
    }
    @And("user enters full name")
    public void userEntersFullName() {
        testCasePage.signupNameBox.sendKeys(faker.name().fullName());
    }
    @And("user enters email")
    public void userEntersEmail() {
        testCasePage.signupEmailBox.sendKeys(faker.internet().emailAddress());
    }
    @Then("user clicks Signup button")
    public void user_clicks_signup_button() {
        testCasePage.signUpButton.click();
    }
    @Then("user verifies that ENTER ACCOUNT INFORMATION is visible")
    public void user_verifies_that_enter_account_information_is_visible() {
        Assert.assertTrue(testCasePage.accountInformationText.isDisplayed());
    }
    @Then("user clicks on title")
    public void user_clicks_on_title() {
        testCasePage.title.click();
    }
    @Then("user enters password")
    public void user_enters_password() {
        testCasePage.password.sendKeys("12345");
    }
    @Then("user enter Date of birth")
    public void user_enter_date_of_birth() {
        dob = new Select(testCasePage.dobDay);
        dob.selectByVisibleText("18");
        dob = new Select(testCasePage.dobMonth);
        dob.selectByVisibleText("June");
        dob = new Select(testCasePage.donYear);
        dob.selectByVisibleText("1995");
    }
    @Then("user selects checkbox Sign up for our newsletter!")
    public void user_selects_checkbox_sign_up_for_our_newsletter() {
        testCasePage.newsletterButton.click();
    }
    @Then("user selects checkbox Receive special offers from our partners!")
    public void user_selects_checkbox_receive_special_offers_from_our_partners() {
        testCasePage.receiveOptionButton.click();
    }
    @Then("user fills details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void user_fills_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.click(testCasePage.firstNameBox).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).perform();
    }
    @Then("user clicks Create Account button")
    public void user_clicks_create_account_button() {
        testCasePage.createAccount.click();
    }
    @Then("user verifies that ACCOUNT CREATED! is visible")
    public void user_verifies_that_account_created_is_visible() {
        Assert.assertTrue(testCasePage.accountCreatedText.isDisplayed());
    }
    @Then("user clicks Continue button")
    public void user_clicks_continue_button() {
        testCasePage.continueButton.click();
    }
    @Then("user verifies that Logged in as username is visible")
    public void user_verifies_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(testCasePage.username.isDisplayed());
    }
    @Then("user clicks Delete Account button")
    public void user_clicks_delete_account_button() {
        testCasePage.deleteAccount.click();
    }
    @And("user verifies that ACCOUNT DELETED! is visible  and click Continue button")
    public void userVerifiesThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        Assert.assertTrue(testCasePage.accountDeleteText.isDisplayed());
        testCasePage.deleteButton.click();
    }
}
