package cucumberTest.scripts;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    @Given("^A ([a-zA-Z]{1,}) username$")
    public void A_valid_username(String usernameValidity) {
        System.out.println("@Given -- A "+ usernameValidity + " username");
    }

    @And("^An ([a-zA-Z]{1,}) password$")
    public void An_incorrect_password(String passwordValidity) {
        System.out.println("@And -- An incorrect " + passwordValidity +" password");
    }

    @When("^I press the login button$")
    public void I_press_the_login_button() {
        System.out.println("@When -- I press the login button");
    }

    @Then("^An ([a-zA-Z]{1,}) message appears$")
    public void An_error_message_appears(String messageType) {
        System.out.println("@Then -- An " + messageType +" message appears");
    }
}
