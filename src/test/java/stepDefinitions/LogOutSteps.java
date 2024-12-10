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
import pageObjects.LoginPOM;
import tasks.LogOutTask;

public class LogOutSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    Actor Tobi = Actor.named ("Tobi");

    @Before
    public void set_the_stage() { OnStage.setTheStage(new OnlineCast()); }

    @When("I logoff swaglabs")
    public void i_logoff_swaglabs() {
        Tobi.can(BrowseTheWeb.with(herMobileDevice));
        Tobi.attemptsTo(LogOutTask.logout());
    }

    @Then("I should see the login page")
    public void i_should_see_the_login_page() {
        Ensure.that(LoginPOM.LOGIN_BTN).isDisplayed();
    }
}
