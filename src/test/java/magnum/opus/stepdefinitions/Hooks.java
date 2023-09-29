package magnum.opus.stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import magnum.opus.core.AppiumDriverExtension;
import magnum.opus.views.LoginView;
import magnum.opus.views.NavigatonBarView;

public class Hooks {
    static AndroidDriver appiumDriver;
    static NavigatonBarView navBar;
    static LoginView loginView;

    /**
     * Sets up the web driver and initialize the page objects.
     */
    @Before("@MOBILE")
    public static void setUpUi() {
        appiumDriver = new AppiumDriverExtension().getInstance();
        navBar = new NavigatonBarView(appiumDriver);
        loginView = new LoginView(appiumDriver);
    }
}
