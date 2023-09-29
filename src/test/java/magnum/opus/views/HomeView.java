package magnum.opus.views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.MobileElement;

/**
 * The HomeView class represents the home view in the mobile application.
 */
public class HomeView extends BaseView {
    @AndroidFindBy(id = "username")
    MobileElement Login;

    /**
     * Constructor for the HomeView class.
     *
     * @param driver The AndroidDriver instance to use for interacting with elements on this view.
     */
    public HomeView(AndroidDriver driver) {
        super(driver);
    }
}
