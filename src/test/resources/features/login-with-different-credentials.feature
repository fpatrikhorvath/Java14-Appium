@ANDROID @smoke
Feature:As a mobile user
  I want to be able to log in with a correct username and password combination
  I should not be logged in with incorrect credentials

  Scenario Outline:The user tries to log in with incorrect or empty username and password
    Given the user is on the "login" view
    And the user types in the "<email>" as "email" (on the "login" view)
    And the user types in the "<password>" as "password" (on the "login" view)
    When the user presses the "login" button (on the "login" view)
    Then the user is not logged in
    Examples:
      | email               | password           |
      | incorrect&email.com | incorrect-password |
      |                     | passowrd           |
      | email@email.com     |                    |

  Scenario:The user tries to log in with correct username and password
    Given the user is on the "login" view
    And the user types in the "testemail@test.com" as "email" (on the "login" view)
    And the user types in the "test1234" as "password" (on the "login" view)
    When the user presses the "login" button (on the "login" view)
    Then the user is logged in