package magnum.opus.views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginView extends BaseView {
    @AndroidFindBy(id = "username")
    WebElement usernameInputField;
    @AndroidFindBy(id = "password")
    WebElement passwordInputField;

    public LoginView(AndroidDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return isElementVisible(usernameInputField);
    }

    public void enterTextToInput(String inputName, String value) {
        switch (inputName) {
            case "username" -> enterTextToElement(usernameInputField, value);
            case "password" -> enterTextToElement(passwordInputField, value);
            default -> throw new IllegalArgumentException(inputName + " is not a valid input field!");
        }
    }
}
