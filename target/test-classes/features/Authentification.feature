Feature: L'utilisateur ne doit pas pouvoir créer de compte avec un mot de passe sans au moins un caractère spécial


  @TEST_POEI22GR3-23 @Automation_Testing_GR3
  Scenario: Lors de la connexion à son compte, l'écran 'Dashboard" doit s'afficher
    Given Dans l'espace My Account

    And  un pavé Login permet de saisir son login et son mot de passe et de valider avec un bouton
    Then le  Dashboard  doit s'afficher et des liens (Orders,Download,Adresses,Account Details,Logout)