package pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPOM {

    public static Target CART_BUTTON = Target.the("Shopping Cart Button").
            located(By.xpath("//android.view.ViewGroup [@content-desc='test-Cart']"));

    public static Target CHECKOUT_BUTTON = Target.the("Checkout Button").
            located(By.xpath( "//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));

    public static Target FIRST_NAME_FIELD = Target.the("First Name Field").
            located(By.xpath( "//android.widget.EditText[@content-desc='test-First Name']"));

    public static Target LAST_NAME_FIELD = Target.the("Last Name Field").
            located(By.xpath("//android.widget.EditText[@content-desc='test-Last Name']"));

    public static Target ZIP_POSTAL_FIELD = Target.the("Zip Postal Field").
            located(By.xpath("//android.widget.EditText[@content-desc='test-Zip/Postal Code']"));

    public static Target CONTINUE_BTN = Target.the("Continue Button").
            located(By.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUE']"));

    public static Target FINISH_BTN = Target.the("Finish Button").
            located(By.xpath("//android.view.ViewGroup[@content-desc='test-FINISH']"));

    public static Target CHECKOUT_OVERVIEW = Target.the("Checkout Overview").
            located(By.xpath("//android.view.ViewGroup[@content-desc='test-Item']"));

    public static Target BACK_HOME_BTN = Target.the("Back Home Button").
            located(By.xpath("//android.view.ViewGroup[@content-desc='test-BACK HOME']"));
}
