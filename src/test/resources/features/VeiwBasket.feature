@REQ_POEI22GR3-8
Feature: Affichage détails des articles

  @TEST_POEI22GR3-120 @Automation_Testing_GR3
  Scenario: un bouton "VIEW BASKET" permettant de se rediriger dans l'espace panier, apparaissent au dessus l'article
    Given ouvrire la page shop
    When cliquer sur le prodiut
    And cliquer sur le bouton Add Basket et view basket
    Then se rediriger  l'espace panier.