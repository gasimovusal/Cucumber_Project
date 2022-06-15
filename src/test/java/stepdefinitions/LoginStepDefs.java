package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DefaultPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;


public class LoginStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @Given("user login dropdown")
    public void user_login_dropdown() {
        homePage.homeLoginButton.click();
    }
    @Given("user send username {string}")
    public void user_send_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @Given("user send password {string}")
    public void user_send_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }
    @Given("user enters admin_username and admin_password")
    public void user_enters_admin_username_and_admin_password(DataTable credentials) {
//        way 1: we can store the data as List of String
        List<String> adminCredentials = credentials.row(1); // returns row 1 data
        loginPage.username.sendKeys(adminCredentials.get(0));
        loginPage.password.sendKeys(adminCredentials.get(1));

//        we can store data as List<Map<String>>
//        List<Map<String, String>> adminCredentials = credentials.asMaps(String.class, String.class);
//
//        for(Map<String, String> eachCredentials : adminCredentials){
//            loginPage.username.sendKeys(eachCredentials.get("admin_id"));
//            loginPage.password.sendKeys(eachCredentials.get("admin_pass"));
//        }
    }

    @Then("verify the login is successful")
    public void verifyTheLoginIsSuccessful() {
        Assert.assertTrue(defaultPage.userID.isDisplayed());
    }
}
