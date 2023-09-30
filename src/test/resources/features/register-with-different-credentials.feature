@ANDROID @smoke
Feature:TODO
  Background:Navigates the user to the sign up form
    Given the user is on the "login" view
    And the user presses the "to sign up" button (on the "login" view)

  Scenario:The user tries to register with not matching email addresses
    Given the user types in the "test@email.com" as "email" (on the "register" view)
    And the user types in the "password1" as "password" (on the "register" view)
    And the user types in the "password2" as "password repeat" (on the "register" view)
    When the user presses the "sign up" button (on the "register" view)