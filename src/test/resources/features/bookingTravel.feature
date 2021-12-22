Feature: Booking a Travel to Cusco
  This feature is about to create a
  reservation to travel to Cusco from
  Puno to Cusco

  Scenario Outline: Verify to Buy a Travel to Cusco passed
    Given I get in the Peru Rail webPage
    And I select my "<destination>" and the "<route>"
    And Besides, I select the "<train>"
    And I select the date to 25 May 2022
    When I select "<numberCabin>" to Suite Cabins Section
    And I'm going to continue to click the button Continue
    And I complete all the information about the passenger
    Then I verify the "<totalPrice>" and the "<trainSelected>"

    Examples:

    | destination | route        | train                            | numberCabin | totalPrice | trainSelected           |
    |   Cusco     | Puno > Cusco |  Andean Explorer, A Belmond Train|  1 CABIN    |  2,415.00  | Belmond Andean Explorer |

  Scenario Outline: Verify to Buy a Travel to Machu Picchu passed
    Given I get in the Peru Rail webPage
    And I select my "<destination>" and the "<route>"
    And I select to date to 25 May 2022
    And I select only 1 person for the travel
    When I select the departure of round trip
    And I complete all the information of the passenger
    Then I verify the "<totalPrice>"

    Examples:
    | destination | route                | totalPrice |
    |Machu Picchu | Cusco > Machu Picchu | 127.00     |