package pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPOM {
    public static Target ADD_TO_CART_BTN = Target.the("AddToCart Button").
    located(By.xpath("//android.view.ViewGroup[@content-desc='test-ADD TO CART']"));

    public static Target SELECT_BACKPACK = Target.the("Select Backpack").
    located (By.xpath("//android.widget.TextView[@content-desc='test-Item title' and @text='Sauce Labs Backpack']"));

    public static Target REMOVE_FROM_CART_BTN = Target.the("Remove From Cart Button").
    located (By.xpath("//android.view.ViewGroup[@content-desc='test-REMOVE']"));
}

