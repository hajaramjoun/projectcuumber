@REQ_POEI22GR3-7
Feature: Ajout panier

  @TEST_POEI22GR3-98 @Automation_Testing_GR3
  Scenario: Un filtre permet d'affiner la vue des articles par thème

    And ouvrir la page shope
    When cliquer sur android
    Then  verifier afficher le resultat
