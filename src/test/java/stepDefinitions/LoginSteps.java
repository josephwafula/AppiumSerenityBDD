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
import pageObjects.HomePOM;
import tasks.LoginTask;

public class LoginSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    Actor Tobi = Actor.named ("Tobi");

    @Before
    public void set_the_stage() { OnStage.setTheStage(new OnlineCast()); }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        Tobi.can(BrowseTheWeb.with(herMobileDevice));
        Tobi.attemptsTo(LoginTask.login(username, password));
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        Ensure.that(HomePOM.HOMEPAGE_MENU).isDisplayed();
    }
}
