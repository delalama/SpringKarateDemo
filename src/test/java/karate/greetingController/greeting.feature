Feature: Greeting generator

  Background:
    * url baseUrl

  Scenario: Get greeting

    Given path 'api/greeting'
    When method GET
    Then status 200
    And match $ == {greeting:'#notnull'}
    And match $ != {greeting:'bye bye'}

  Scenario Outline: Post greeting

    Given path 'api/greeting'
    And request {name:'<name>'}
    When method POST
    Then status 200
    And match $ == {'greeting': 'hello <name>'}

    Examples:
      | name  |
      | Tim   |
      | Liz   |
      | Selma |
      | Ted   |
      | Luise |