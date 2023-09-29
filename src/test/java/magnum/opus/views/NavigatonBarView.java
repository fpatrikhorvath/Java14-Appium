package magnum.opus.views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.MobileElement;

/**
 * The NavigationBarView class represents the navigation bar view in the mobile application.
 */
public class NavigatonBarView extends BaseView {
    //Element representations
    @AndroidFindBy(accessibility = "Login")
    MobileElement loginNavigationButton;

    /**
     * Constructor for the NavigationBarView class.
     *
     * @param driver The AndroidDriver instance to use for interacting with elements on this view.
     */
    public NavigatonBarView(AndroidDriver driver) {
        super(driver);
    }

    /**
     * Clicks the specified navigation button on the navigation bar view.
     *
     * @param buttonName The name of the button to click (e.g., "login").
     * @throws IllegalArgumentException If an invalid buttonName is provided.
     */
    public void clickToNavigationButton(String buttonName) {
        switch (buttonName) {
            case "login" -> clickOnElement(loginNavigationButton);
            default -> throw new IllegalArgumentException(buttonName + " is not a valid input field!");
        }
    }
}
