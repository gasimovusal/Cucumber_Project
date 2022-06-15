package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TC01_TestCasePage;
import utilities.Driver;

import java.security.Key;

public class TC01_SignupStepDefs {

    TC01_TestCasePage testCasePage = new TC01_TestCasePage();
    Actions actions = new Actions(Driver.getDriver());
    Select dob;

    @Then("user navigates to signup page")
    public void user_navigates_to_signup_page() {
        testCasePage.singupPage.click();
    }
    @Then("user verifies New User Signup! is visible")
    public void user_verifies_new_user_signup_is_visible() {
        Assert.assertTrue(testCasePage.newUserSignup.isDisplayed());
    }
    @And("user enter name {string}")
    public void userEnterName(String name) {
        testCasePage.signupNameBox.sendKeys(name);
    }
    @And("user enter email {string}")
    public void userEnterEmail(String email) {
        testCasePage.signupEmailBox.sendKeys(email);
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
//        dob = new Select(testCasePage.dob);
//        dob.selectByVisibleText("18");
        actions.click(testCasePage.dob).sendKeys("18").sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys("Jun").sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys("1995").sendKeys(Keys.ENTER).perform();
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
        actions.click(testCasePage.firstNameBox).sendKeys("James")
                .sendKeys(Keys.TAB).sendKeys("Battey")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("123 main street")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("MA")
                .sendKeys(Keys.TAB).sendKeys("Boston")
                .sendKeys(Keys.TAB).sendKeys("01089")
                .sendKeys(Keys.TAB).sendKeys("123456789").perform();
    }
    @Then("user clicks Create Account button")
    public void user_clicks_create_account_button() {
        testCasePage.createAccount.click();
    }
    @Then("user verifis that ACCOUNT CREATED! is visible")
    public void user_verifis_that_account_created_is_visible() {
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
    @Then("user verifies that ACCOUNT DELETED! is visible")
    public void user_verifies_that_account_deleted_is_visible() {
        Assert.assertTrue(testCasePage.accountDeleteText.isDisplayed());
    }

}
