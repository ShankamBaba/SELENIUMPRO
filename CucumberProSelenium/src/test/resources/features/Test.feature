@all
Feature: Loginb functionality check
  Description: testing login fun with all valid invalid cases
  
  
  Rule: There can be only One

  #@Sc1
  #Scenario: Login functionality with valid credentials
  #Given user is on the login page
  #When user inputs username & password
  #And Clicks on login button
  #Then User should login successfully
  #
  #@Sc2
  #Scenario: Login functionality with invalid credentials
  #Given user is on the login page
  #When user inputs username & password
  #And Clicks on login button
  #Then User should login successfully
  #
  #@Sc3
  #Scenario: Login functionality with valid and  invalid credentials
  #Given user is on the login page
  #When user inputs username & password
  #And Clicks on login button
  #Then User should login successfully
  #
  #@Sc4
  #Scenario: Login functionality with valid and  invalid credentials
  #Given user is on the login page
  #When user inputs username & password
  #And Clicks on login button
  #Then User should login successfully
  # CTRL+/
  Background: Run before each scenario in this feature file
    Given user is on the login page

  # hard coding
  Scenario: Login Functionality3
    When user inputs username "vivek" & password "jkflkklklfklfkl"
    And Clicks on login button
    Then User should login successfully

  # Data Provider
  Scenario Outline: Login Functionality3
    When user inputs username "<username>" & password "<password>" and verify login
    Then User should login successfully

    @Valid
    Examples: 
      | username1   | password1    |
      | jhdjjd      | kjdkjkjd     |
      | gbhdjhhjd   | hjdsfhhjfdjh |
      | bjhdhjhjd   | hhdshjdshj   |
      | hjdskjkjd   | jhkjjk       |
      | hkndvkjkjdf | bjjhdhjd     |

    @Invalid
    Scenarios: 
      | username1   | password1    |
      | jhdjjd      | kjdkjkjd     |
      | gbhdjhhjd   | hjdsfhhjfdjh |
      | bjhdhjhjd   | hhdshjdshj   |
      | hjdskjkjd   | jhkjjk       |
      | hkndvkjkjdf | bjjhdhjd     |

  # DataTable
  Scenario: Login Functionality2
    * user inputs username & password and verify login
      | username    | password     |
      | jhdjjd      | kjdkjkjd     |
      | gbhdjhhjd   | hjdsfhhjfdjh |
      | bjhdhjhjd   | hhdshjdshj   |
      | hjdskjkjd   | jhkjjk       |
      | hkndvkjkjdf | bjjhdhjd     |
    * User should login successfully


Scenario: Using doc strings to pass complex data
    Given the following text:
      """
      This is a multi-line text example.
      It can contain line breaks and special characters.
      For example:
        - Bullet points
        - Special characters: @, #, $
      """

      
      #Scenario: Login Functionality21
    #* user inputs username & password and verify login1
    #* user inputs username & password and verify login2
    
    
    
    

    #Scenario: Only One -- More than one alive
      #Given there are 3 ninjas
      #And there are more than one ninja alive
      #When 2 ninjas meet, they will fight
      #Then one ninja dies (but not me)
      #And there is one ninja less alive
    
    
    

    