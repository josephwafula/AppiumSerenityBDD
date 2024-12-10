package pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPOM {
    public static Target USERNAME_FIELD = Target.the("Username Field").
    located (By.xpath("//android.widget.EditText[@content-desc='test-Username']"));

    public static Target PASSWORD_FIELD = Target.the("Password Field").
    located(By.xpath("//android.widget.EditText[@content-desc='test-Password']"));

    public static Target CREDENTIALS_LINK = Target.the("Credentials Link").
    located (By.xpath("//android.widget.TextView[@text='standard_user']"));

    public static Target LOGIN_BTN = Target.the("Login Button").
    located (By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
}
