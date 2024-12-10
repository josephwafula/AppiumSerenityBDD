
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith (CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"stepDefinitions"},
        tags = "test"
    )

public class Runner {

    static AppiumDriverLocalService appiumService = null;
    static AppiumServiceBuilder builder;

    @BeforeClass
    public static void startAppiumServer() {
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.BASEPATH, "/wd/hub");
        appiumService = AppiumDriverLocalService.buildService(builder);
        appiumService.start();
    }

    @AfterClass
    public static void stopAppiumServer() { appiumService.stop(); }
}