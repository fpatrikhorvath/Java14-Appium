package magnum.opus.stepdefinitions;

import io.cucumber.java.en.Given;

import static magnum.opus.stepdefinitions.Hooks.*;

public class LoginViewSteps {
    @Given("the user is on the {string} view")
    public void theUserIsOnTheView(String viewName) {
        switch (viewName) {
            case "login" -> navBar.clickToNavigationButton(viewName);
            default -> throw new IllegalArgumentException(viewName + " is not a valid/implemented view!");
        }
    }
}
