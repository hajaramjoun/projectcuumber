$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/1_POEI22-746.feature");
formatter.feature({
  "name": "L\u0027utilisateur ne doit pas pouvoir créer de compte avec un mot de passe sans au moins un caractère spécial",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreationCompte"
    }
  ]
});
formatter.scenario({
  "name": "L\u0027utilisateur ne doit pas pouvoir créer de compte avec un mot de passe sans au moins un caractère spécial",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreationCompte"
    },
    {
      "name": "@TEST_POEI22GR3-20"
    },
    {
      "name": "@Automation_Testing_GR3"
    }
  ]
});
formatter.step({
  "name": "site web",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsUs1.siteWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click MyAccount",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsUs1.clickMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Remplire le mail et le mot de passe et  regitrer et Le mot de passe doit être composé à minima de 7 caractères et contenir à minima une majuscule, une minuscule, un chiffre et un caractère spécial",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsUs1.remplireLeMailEtLeMotDePasseEtRegitrerEtLeMotDePasseDoitÊtreComposéÀMinimaDeCaractèresEtContenirÀMinimaUneMajusculeUneMinusculeUnChiffreEtUnCaractèreSpécial(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "le compte est bien créer",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsUs1.leCompteEstBienCréer()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Authentification.feature");
formatter.feature({
  "name": "Authentification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEI22GR3-2"
    }
  ]
});
formatter.scenario({
  "name": "Lors de la connexion à son compte, l\u0027écran \u0027Dashboard\" doit s\u0027afficher",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POEI22GR3-2"
    },
    {
      "name": "@TEST_POEI22GR3-23"
    },
    {
      "name": "@Automation_Testing_GR3"
    }
  ]
});
formatter.step({
  "name": "Dans l\u0027espace My Account",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsUs2.dansLEspaceMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "un pavé Login permet de saisir son login et son mot de passe et de valider avec un bouton",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsUs2.unPavéLoginPermetDeSaisirSonLoginEtSonMotDePasseEtDeValiderAvecUnBouton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "le  Dashboard  doit s\u0027afficher et des liens (Orders,Download,Adresses,Account Details,Logout)",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsUs2.leDashboardDoitSAfficherEtDesLiensOrdersDownloadAdressesAccountDetailsLogout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});