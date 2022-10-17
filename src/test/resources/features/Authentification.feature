@REQ_POEI22GR3-2
Feature: Authentification


  @TEST_POEI22GR3-24 @Automation_Testing_GR3
  Scenario: Lors de la connexion à son compte, des liens renvoyant aux pages : Dashboard, Orders, Download, Adresses, Account Details et Logout sont présents
    Given ouvrir l'onglet MyAccount
    And  un pavé Login permet de saisir son login et son mot de passe et de valider avec un bouton
    Then le  Dashboard  doit s'afficher et des liens (Orders,Download,Adresses,Account Details,Logout)
    And  deconection