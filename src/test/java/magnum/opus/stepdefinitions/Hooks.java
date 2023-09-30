package magnum.opus.stepdefinitions;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import magnum.opus.core.AppiumDriverExtension;
import magnum.opus.views.LoginView;
import magnum.opus.views.NavigatonBarView;
import magnum.opus.views.RegisterView;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/**
 * This class contains Cucumber hooks for setting up and tearing down the Android driver and view objects.
 * It is responsible for initializing the Android driver and associated view objects before scenarios tagged with
 * @TypeName
 */
public class Hooks {
    static AndroidDriver androidDriver;
    static NavigatonBarView navBar;
    static LoginView loginView;
    static RegisterView registerView;

    /**
     * Sets up the Android driver and initializes view objects.
     */
    @Before("@ANDROID")
    public static void setUpAndroid() {
        androidDriver = new AppiumDriverExtension().getInstance();
        navBar = new NavigatonBarView(androidDriver);
        loginView = new LoginView(androidDriver);
        registerView = new RegisterView(androidDriver);
    }

    /**
     * Tears down the Android driver after scenario execution.
     */
    @After("@ANDROID")
    public static void tearDownAndroid(Scenario scenario) {
        if (scenario.isFailed()){
            final byte[] SCREENSHOT = ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(SCREENSHOT,"image/png", scenario.getName());
        }
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }
}
