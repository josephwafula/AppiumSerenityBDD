package tasks;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import pageObjects.ShopPOM;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ShopTask implements Task {

    @Override
    @Step("{0} shop in swaglabs")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShopPOM.SELECT_BACKPACK),
                Clear.field(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()")),
        Click.on(ShopPOM.ADD_TO_CART_BTN)
        );
    }

    public static ShopTask addToCart() { return instrumented (ShopTask.class);}

}
