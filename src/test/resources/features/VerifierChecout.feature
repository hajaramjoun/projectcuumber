@REQ_POEI22GR3-9
Feature: Consultation panier

  @TEST_POEI22GR3-137 @Automation_Testing_GR3
  Scenario: Un bouton "Proceed to Checkout" permet de valider la commande et de passer au paiement
    Given open shopchecout
    And Ajouter un articleChekout and open panier
    When click sur  Proceed to Checkout
    Then verifier le passeage  au paiement
