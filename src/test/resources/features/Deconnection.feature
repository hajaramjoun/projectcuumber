@REQ_POEI22GR3-6
Feature: Déconnexion

  @TEST_POEI22GR3-114 @Automation_Testing_GR3
  Scenario: Test Déconnexion
    Given ouvrir l'onglet MyAccount
    When  un pavé Login permet de saisir son login et son mot de passe et de valider avec un bouton
    Then deconection
