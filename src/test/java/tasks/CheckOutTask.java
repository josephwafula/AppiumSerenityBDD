package tasks;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pageObjects.CheckOutPOM;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckOutTask implements Task {

    private String firstName="";
    private String lastName="";
    private String zipCode="";

    public CheckOutTask(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode= zipCode;
    }

    @Override
    @Step("{0} checkout from swaglabs")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CheckOutPOM.CART_BUTTON),
            Click.on (CheckOutPOM.CHECKOUT_BUTTON),
            Enter.theValue(this.firstName).into(CheckOutPOM.FIRST_NAME_FIELD),
            Enter.theValue(this.lastName).into(CheckOutPOM.LAST_NAME_FIELD),
            Enter.theValue(this.zipCode).into(CheckOutPOM.ZIP_POSTAL_FIELD),
            Click.on(CheckOutPOM.CONTINUE_BTN),
            Clear.field(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()")),
            Click.on(CheckOutPOM.FINISH_BTN)
        );
    }

    public static CheckOutTask checkout(String firstName, String lastName, String zipCode) {
          return instrumented(CheckOutTask.class, firstName, lastName, zipCode);
    }
}
