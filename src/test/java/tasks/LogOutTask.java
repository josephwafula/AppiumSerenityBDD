package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageObjects.HomePOM;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogOutTask implements Task {

    @Override
    @Step("{0} logout from swaglabs")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePOM.HOMEPAGE_MENU),
                Click.on(HomePOM.LOGOUT_BTN)
        );
    }

    public static LogOutTask logout() { return instrumented (LogOutTask.class); }
}

