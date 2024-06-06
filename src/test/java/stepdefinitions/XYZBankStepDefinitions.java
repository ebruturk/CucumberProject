package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.XYZBankHomePage;
import utilities.Driver;

public class XYZBankStepDefinitions {
    XYZBankHomePage xyzBankHomePage = new XYZBankHomePage();

    @When("click on Bank Manager Login")
    public void click_on_bank_manager_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on Add Customer")
    public void click_on_add_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("enter firstname {string},lastname\"doe\", postcode\"{int}\"")
    public void enter_firstname_lastname_doe_postcode(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on Add Costomer Submit button")
    public void click_on_add_costomer_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("enter firstname {string},lastname\"kaya\", postcode\"{int}\"")
    public void enter_firstname_lastname_kaya_postcode(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("enter firstname {string},lastname\"alp\", postcode\"{int}\"")
    public void enter_firstname_lastname_alp_postcode(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
