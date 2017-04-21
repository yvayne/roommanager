
Feature: Resource

  Scenario: Create a new resource
    #Given I am login on Admin Page
    #When I go to resource page
    Given I create a new resource with the following information
    |Name|Test|test|
    |Displayed Name|TestName|test|
    |test|test|                  test|
   # Then the resource should be displayed on resource table

    #And the resource should be created on db
