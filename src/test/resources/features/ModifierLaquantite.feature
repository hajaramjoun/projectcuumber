@REQ_POEI22GR3-9
Feature: Consultation panier 

	@TEST_POEI22GR3-131 @Automation_Testing_GR3
	Scenario: Chaque article la quantité de chaque article peut être modifié par le champ quantité
		Given open shopUpdate
		And Ajouter un articleUpdate
		When modifier la quantité
		Then verifier que la quantité est bien modifier
