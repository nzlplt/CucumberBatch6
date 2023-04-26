Feature: Negative Login Test

  @wip
  Scenario Outline: Negative Login Test Devex
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>" credentials
    Then The warning message contains "<message>"

    Examples:
      | userType           | password        | message                                                                                  |
      | eurotech@gmail.com | 1               | Please lengthen this text to 6 characters or more (you are currently using 1 character). |
      | eurotech           | 1               | Please include an '@' in the email address. 'eurotech' is missing an '@'.                |
      | eurotech@          | 1               | Please enter a part following '@'. 'eurotech@' is                            |
      | eurotech@@@        | 1               | A part following '@' should not contain the symbol '@'.                                  |
      | eurotech@gmail.com | 126tfgdhfgdgfhd | Invalid Credentials                                                                     |
      | eurot@gmail        | 126tfgdhfgdgfhd | Please include a valid email!                                                           |