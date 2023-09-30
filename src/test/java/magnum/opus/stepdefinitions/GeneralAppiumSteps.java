package magnum.opus.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static magnum.opus.stepdefinitions.Hooks.*;

/**
 * This class defines Cucumber step definitions for general Appium actions.
 * It includes steps related to navigating views, entering text, and pressing buttons.
 */
public class GeneralAppiumSteps {
    /**
     * Specifies that the user is on the given view.
     *
     * @param viewName The name of the view to navigate to.
     * @throws IllegalArgumentException If an invalid or unimplemented view name is provided.
     */
    @Given("the user is on the {string} view")
    public void theUserIsOnTheView(String viewName) {
        switch (viewName) {
            case "login" -> navBar.clickToNavigationButton(viewName);
            default -> throw new IllegalArgumentException(viewName + " is not a valid/implemented view!");
        }
    }

    /**
     * Enters the specified value into the designated input field on the given view.
     *
     * @param value      The text value to enter.
     * @param inputField The name or identifier of the input field.
     * @param viewName   The name of the view where the input field is located.
     * @throws IllegalArgumentException If an invalid view name is provided.
     */
    @And("the user types in the {string} as {string} \\(on the {string} view)")
    public void theUserTypesInTheAsOnThePage(String value, String inputField, String viewName) {
        switch (viewName) {
            case "login" -> loginView.enterTextToInput(inputField, value);
            case "register" -> registerView.enterTextToInput(inputField, value);
            default -> throw new IllegalArgumentException(viewName + " is not a valid view!");
        }
    }
    /**
     * Presses the specified button on the given view.
     *
     * @param buttonName The name or identifier of the button to press.
     * @param viewName   The name of the view where the button is located.
     * @throws IllegalArgumentException If an invalid view name is provided.
     */
    @When("the user presses the {string} button \\(on the {string} view)")
    public void theUserPressesTheButtonOnTheView(String buttonName, String viewName) {
        switch (viewName) {
            case "login" -> loginView.clickOnButton(buttonName);
            case "register" -> registerView.clickOnButton(buttonName);
            default -> throw new IllegalArgumentException(viewName + " is not a valid view!");
        }
    }
}
