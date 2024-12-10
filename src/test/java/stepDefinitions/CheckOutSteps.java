package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pageObjects.CheckOutPOM;
import tasks.CheckOutTask;

public class CheckOutSteps {

        @Managed(driver = "Appium")
        public WebDriver herMobileDevice;

        Actor Tobi = Actor.named ("Tobi");

        @Before
        public void set_the_stage() { OnStage.setTheStage(new OnlineCast()); }

        @And("I checkout with firstname {string}, lastname {string} and zipcode {string}")
        public void i_checkout(String firstName, String lastName, String zipCode) {
            Tobi.can(BrowseTheWeb.with(herMobileDevice));
            Tobi.attemptsTo(CheckOutTask.checkout(firstName, lastName, zipCode));
        }

        @Then("I should see sauce_labs_backpack in checkout confirmation page")
        public void i_should_see_sauce_labs_backpack_in_shopping_cart() {
            Ensure.that(CheckOutPOM.BACK_HOME_BTN).isDisplayed();
        }
    }
