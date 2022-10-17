$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreationsCompte.feature");
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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.cssSelector: strong (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027DESKTOP-6IM55F2\u0027, ip: \u0027192.168.121.113\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\IB\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:54037}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:54037/devtoo..., se:cdpVersion: 106.0.5249.119, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a9716ab8472fd816a585fa699377e3b3\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:87)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat pages.MyAccountPage.verifierCreationDeCompte(MyAccountPage.java:82)\r\n\tat steps.MyStepdefsUs1.leCompteEstBienCréer(MyStepdefsUs1.java:57)\r\n\tat ✽.le compte est bien créer(file:src/test/resources/features/CreationsCompte.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "logout",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsUs1.logout()"
});
formatter.result({
  "status": "skipped"
});
});