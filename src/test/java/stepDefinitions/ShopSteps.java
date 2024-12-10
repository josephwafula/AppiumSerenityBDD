package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pageObjects.ShopPOM;
import tasks.ShopTask;

public class ShopSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    Actor Tobi = Actor.named ("Tobi");

    @Before
    public void set_the_stage() { OnStage.setTheStage(new OnlineCast()); }

    @When("I add Sauce Labs Backpack to cart")
    public void i_add_sauce_labs_backpack_to_cart() {
        Tobi.can(BrowseTheWeb.with(herMobileDevice));
        Tobi.attemptsTo(ShopTask.addToCart());
    }

    @Then("I should see sauce_labs_backpack in shopping cart")
    public void i_should_see_sauce_labs_backpack_in_shopping_cart() {
        Ensure.that(ShopPOM.REMOVE_FROM_CART_BTN).isDisplayed();

    }
}
