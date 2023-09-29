package magnum.opus.views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NavigatonBarView extends BaseView {
    @AndroidFindBy(accessibility = "Login")
    WebElement loginNavigationButton;

    public NavigatonBarView(AndroidDriver driver) {
        super(driver);
    }

    public void clickToNavigationButton(String buttonName) {
        switch (buttonName) {
            case "login" -> clickOnElement(loginNavigationButton);
            default -> throw new IllegalArgumentException(buttonName + " is not a valid input field!");
        }
    }
}
