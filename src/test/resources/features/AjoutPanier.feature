@REQ_POEI22GR3-7
Feature: Ajout panier


  @TEST_POEI22GR3-95 @Automation_Testing_GR3
  Scenario: A chaque ajout dans le panier, il y a un lien "View basket" qui redirige vers le panier
    Given se connecter a l application
    When ouvrir l'onglet Shop
    And clicer sur le bouton ADD TO BASKET
    And clicer sur le bouton VIEW BASKET
    Then verifier un lien VIEW BASKET apparaît au dessous l'article


