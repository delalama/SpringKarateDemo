Feature: Greeting generator

  Background:
    * url baseUrl

  Scenario: Fetch greeting

    Given path 'api/greeting'
    When method GET
    Then status 200
    And match $ == {greeting:'#notnull'}