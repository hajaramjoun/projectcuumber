package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.MyAccountPage;
import pages.Shop;

import java.util.ArrayList;
import java.util.List;

public class MyStepdefsUs2 {
    Shop shop;
    HomePage homePage;
    MyAccountPage myAccountPage;
    WebDriver driver;




    @Given("ouvrir l'onglet MyAccount")
    public void ouvrirLOngletMyAccount() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickMyAccount();
    }

    @And("un pavé Login permet de saisir son login et son mot de passe et de valider avec un bouton")
    public void unPavéLoginPermetDeSaisirSonLoginEtSonMotDePasseEtDeValiderAvecUnBouton() {
        myAccountPage = new MyAccountPage(driver);
        String email = "jinane0.4842976411800083.basraoui@gmail.com";
        String psw = "&aqw1AQW1AQSWreegrgn";
        myAccountPage.remplirEtValiderLeformulaireLogin(email, psw);
    }

    @Then("le  Dashboard  doit s'afficher et des liens \\(Orders,Download,Adresses,Account Details,Logout)")
    public void leDashboardDoitSAfficherEtDesLiensOrdersDownloadAdressesAccountDetailsLogout() {
        List<String> expected = new ArrayList<>();
        ArrayList actual = new ArrayList();
        actual.add("Dashboard");
        actual.add("Orders");
        actual.add("Downloads");
        actual.add("Addresses");
        actual.add("Account Details");
        actual.add("Logout");
        expected.addAll(myAccountPage.verifierDashboardLiens());
        // Asserts
        Assert.assertEquals(actual, expected);

    }


    @And("deconection")
    public void deconection() {
        myAccountPage.clickLougout();
        driver.getPageSource().contains("Login");
        driver.quit();

    }


}
