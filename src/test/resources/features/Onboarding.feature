@wip
Feature:Onboarding Tests


  Scenario: ONB2-107 Personal Information section in the new onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen Personal Information section


  Scenario:  ONB2-108 Company Registration section in the new onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen Company Registration section


  Scenario: ONB2-109 Resources section in the new onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen Resources section


  Scenario: ONB2-110 Completion Date at The Latest section in the new onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen Completion Date at The Latest section


  Scenario:  ONB2-111 Comments section in the new onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen Comments section


  Scenario: ONB2-137 Show logs button in the Action section of first element of Onboarding list should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    Then The User verify that “Show Logs” button in the Action section is visible


  Scenario: ONB2-139 Total number of the Elements in List of Onboardings should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User scroll in to bottom of the page
    Then The User verify that total number of elements in the List of Onboardings is visible


  Scenario: ONB2-140 Edit icon in the Draft Elements of Onboardings List should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User click on Draft tab under the List of Onboardings headline
    Then The User verify that edit icon in the Actions section of first element of list should be visible


  Scenario: ONB2-141 Personal Information section  in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User click on Draft tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then the User verify that Personel Information section in the Edit Onboarding page is visible


  Scenario: ONB2-142 Company Registration section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User click on Draft tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then the User verify that Company Registration section in the Edit Onboarding page is visible


  Scenario: ONB2-143 Resources section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User click on Draft tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then the User verify that Resources section in the Edit Onboarding page is visible


  Scenario: ONB2-144 Completion Date at The Latest section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User click on Draft tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then the User verify that Completion Date at The Latest section in the Edit Onboarding page is visible


  Scenario: ONB2-145 Comments section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The User click on Draft tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then the User verify that Comments section in the Edit Onboarding page is visible


  Scenario: ONB2-304 Attachments section in the new onboarding page should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen Attachments section

  Scenario: ONB2-306 The "Select File" button in the Attachments section should be visible
    Given The user goes to staging url
    And User logs into the web application with the given test data as a requester
    And The User click on the “Onboarding” section in the Navigation Menu
    And The user click on the “New Onboarding” button top right corner of the page
    Then the user should seen “Select File” button in the Attachments section


