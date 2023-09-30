package magnum.opus.views;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterView extends BaseView{
    @AndroidFindBy(id = "android:id/message")
    MobileElement loggedInMessagebox;
    @AndroidFindBy(accessibility = "input-email")
    MobileElement emailInputField;
    @AndroidFindBy(accessibility = "input-password")
    MobileElement passwordInputField;
    @AndroidFindBy(accessibility = "input-repeat-password")
    MobileElement passwordRepeatInputField;
    @AndroidFindBy(accessibility = "button-SIGN UP")
    MobileElement signUpButton;
    /**
     * Constructor for initializing a BaseView object.
     *
     * @param driver The AndroidDriver instance used for interaction with the mobile app.
     */
    public RegisterView(AndroidDriver driver) {
        super(driver);
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
            case "password repeat" -> enterTextToElement(passwordRepeatInputField, value);
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
            case "sign up" -> clickOnElement(signUpButton);
            default -> throw new IllegalArgumentException(buttonName + " is not a valid button!");
        }
    }
    /**
     * Checks if the specified element is visible on the register view.
     *
     * @param elementName The name of the element.
     * @return true if the element is visible, otherwise false.
     */
    public boolean isElementAppeared(String elementName) {
        return switch (elementName) {
            case "logged in box" -> isElementVisible(loggedInMessagebox);
            default -> throw new IllegalArgumentException(elementName + " is not a valid element!");
        };
    }
}
