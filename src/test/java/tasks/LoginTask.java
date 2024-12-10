package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pageObjects.LoginPOM;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private String userName="";
    private String password="";

    public LoginTask(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    @Step("{0} login to swaglabs")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.userName).into (LoginPOM.USERNAME_FIELD),
                Enter.theValue(this.password).into (LoginPOM.PASSWORD_FIELD),
                Click.on(LoginPOM.LOGIN_BTN)
        );
    }

public static LoginTask login(String userName, String password){
    return instrumented(LoginTask.class, userName, password);
    }
}
