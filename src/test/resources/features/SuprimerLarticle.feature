@REQ_POEI22GR3-9
Feature: Consultation panier

  @TEST_POEI22GR3-129 @Automation_Testing_GR3
  Scenario: Chaque article peut être supprimé par un bouton,
    Given ouvrir shop
    And Ajouter un article   and ouvrire la page de panier
    When Chaque article peut être supprimé par un bouton
    Then verifier que des articles est bien supprimer
