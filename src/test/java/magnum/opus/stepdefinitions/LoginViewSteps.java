package magnum.opus.stepdefinitions;

import io.cucumber.java.en.Then;

import static magnum.opus.stepdefinitions.Hooks.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The LoginViewSteps class defines Cucumber step definitions for scenarios related to the login view.
 */
public class LoginViewSteps {
    /**
     * Verifies that the user is not logged in.
     */
    @Then("the user is not logged in")
    public void theUserIsNotLoggedIn() {
        String message = "The user should not be authenticated!";
        boolean isLoginPageInitialized = loginView.isElementAppeared("logged in box");
        assertFalse(message, isLoginPageInitialized);
    }

    /**
     * Verifies that the user is logged in.
     */
    @Then("the user is logged in")
    public void theUserIsLoggedIn() {
        String message = "The user should not be authenticated!";
        boolean isLoginPageInitialized = loginView.isElementAppeared("logged in box");
        assertTrue(message, isLoginPageInitialized);
    }
}
