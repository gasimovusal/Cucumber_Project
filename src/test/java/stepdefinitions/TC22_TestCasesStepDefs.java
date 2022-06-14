package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TC22_TestCasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC22_TestCasesStepDefs {

    TC22_TestCasePage testCase22 = new TC22_TestCasePage();

    @Given("user opens the browser")
    public void user_opens_the_browser() {
        Driver.getDriver();
    }
    @When("user navigates to home page")
    public void user_navigates_to_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
    }
    @Then("user scrolls to bottom of page")
    public void user_scrolls_to_bottom_of_page() {
        ReusableMethods.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",testCase22.winterTop);
    }
    @Then("verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(testCase22.recommendedItemsText.isDisplayed());
    }
    @And("user clicks on Add To Cart on Recommended product")
    public void userClicksOnAddToCartOnRecommendedProduct() {
        ReusableMethods.waitFor(1);
        testCase22.winterTop.click();
    }
    @And("user clicks on View Cart button")
    public void userClicksOnViewCartButton() {
        ReusableMethods.waitFor(1);
        testCase22.viewCartButton.click();
    }
    @Then("verify that product is displayed in cart page")
    public void verify_that_product_is_displayed_in_cart_page() {
        Assert.assertTrue(testCase22.verifyWinterTop.isDisplayed());
    }
    @Then("user close the browser")
    public void user_close_the_browser() {
        Driver.closeDriver();
    }

}
