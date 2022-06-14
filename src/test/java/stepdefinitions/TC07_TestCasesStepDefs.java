package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC07_TestCasesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC07_TestCasesStepDefs {

    TC07_TestCasesPage testCasesPage = new TC07_TestCasesPage();

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        Driver.getDriver();
    }
    @When("user navigate to URL")
    public void user_navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }
    @Then("user verifies that home page is visible successfully")
    public void user_verifies_that_home_page_is_visible_successfully() {
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }
    @And("user clicks of Test Case button")
    public void userClicksOfTestCaseButton() {
        testCasesPage.testCasesLink.click();
    }
    @Then("user is navigated to test case page successfully")
    public void user_is_navigated_to_test_case_page_successfully() {
        Assert.assertTrue(testCasesPage.testCasesText.isDisplayed()); //1.way
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }
}
