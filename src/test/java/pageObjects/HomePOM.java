package pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePOM {

    public static Target HOMEPAGE_MENU = Target.the("HomePage Menu").
            located(By.xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView"));

    public static Target LOGOUT_BTN = Target.the("Logout Button").
            located(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGOUT']"));
}
