@REQ_POEI22GR3-9
Feature: Consultation panier

  @TEST_POEI22GR3-122 @Automation_Testing_GR3
  Scenario:  La page panier affiche un récapitulatif des articles ajoutés spécifiant la quantité, le prix unitaire et le prix total
    Given open shop
   When Ajouter un article et ouvrire la page de panier
    Then verifier que des articles ajoutés spécifiant la quantité, le prix unitaire et le prix total
