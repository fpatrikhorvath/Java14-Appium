package magnum.opus.views;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
/**
 * The LoginView class represents the login view in a mobile application.
 * It extends the BaseView class and provides methods to interact with elements on the login view.
 */
public class LoginView extends BaseView {
    //Mobile element representations
    @AndroidFindBy(id = "android:id/message")
    MobileElement loggedInMessagebox;
    @AndroidFindBy(accessibility = "input-email")
    MobileElement emailInputField;
    @AndroidFindBy(accessibility = "input-password")
    MobileElement passwordInputField;
    @AndroidFindBy(accessibility = "button-LOGIN")
    MobileElement loginButton;

    /**
     * Constructor for initializing a LoginView object.
     *
     * @param driver The AndroidDriver instance used for interaction with the mobile app.
     */
    public LoginView(AndroidDriver driver) {
        super(driver);
    }

    /**
     * Checks if the login view is initialized and visible.
     *
     * @return true if the view is initialized, otherwise false.
     */
    public boolean isInitialized() {
        return isElementVisible(emailInputField);
    }

    /**
     * Enters text into the specified input field.
     *
     * @param inputField The type of input field ("email" or "password").
     * @param value      The text to be entered into the input field.
     */
    public void enterTextToInput(String inputField, String value) {
        switch (inputField) {
            case "email" -> enterTextToElement(emailInputField, value);
            case "password" -> enterTextToElement(passwordInputField, value);
            default -> throw new IllegalArgumentException(inputField + " is not a valid input field!");
        }
    }

    /**
     * Clicks on the specified button.
     *
     * @param buttonName The name of the button ("login").
     */
    public void clickOnButton(String buttonName) {
        switch (buttonName) {
            case "login" -> clickOnElement(loginButton);
            default -> throw new IllegalArgumentException(buttonName + " is not a valid button!");
        }
    }

    /**
     * Checks if the specified element is visible on the login view.
     *
     * @param elementName The name of the element ("logged in box").
     * @return true if the element is visible, otherwise false.
     */
    public boolean isElementAppeared(String elementName) {
        return switch (elementName) {
            case "logged in box" -> isElementVisible(loggedInMessagebox);
            default -> throw new IllegalArgumentException(elementName + " is not a valid element!");
        };
    }
}
