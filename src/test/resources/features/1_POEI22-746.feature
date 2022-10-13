@CreationCompte
Feature: L'utilisateur ne doit pas pouvoir créer de compte avec un mot de passe sans au moins un caractère spécial

  @TEST_POEI22GR3-20 @Automation_Testing_GR3
  Scenario: L'utilisateur ne doit pas pouvoir créer de compte avec un mot de passe sans au moins un caractère spécial
    Given site web
    When click MyAccount
    And Remplire le mail et le mot de passe et  regitrer et Le mot de passe doit être composé à minima de 7 caractères et contenir à minima une majuscule, une minuscule, un chiffre et un caractère spécial
    Then le compte est bien créer

