package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.MyAccountPage;
import pages.Shop;

public class MyStepdefsUs7 {
    Shop shop;
    HomePage homePage;
    WebDriver driver;
    MyAccountPage myAccountPage;



    @Given("se connecter a l application")
    public void seConnecterALApplication() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickMyAccount();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        String email = "jinane0.4842976411800083.basraoui@gmail.com";
        String psw = "&aqw1AQW1AQSWreegrgn";
        myAccountPage.remplirEtValiderLeformulaireLogin(email, psw);
    }


    @When("ouvrir l'onglet Shop")
    public void ouvrirLOngletShop() {

       homePage.clickShop();
    }

    @And("clicer sur le bouton ADD TO BASKET")
    public void clicerSurLeBoutonADDTOBASKET() {
        shop = new Shop(driver);
        shop.clickAddREdame();
//        ADD TO BASKET
    }

    @And("clicer sur le bouton VIEW BASKET")
    public void clicerSurLeBoutonVIEWBASKET() {

        driver.get("https://practice.automationtesting.in/basket/");
//        shop.clickViewBasket(); //AAAAAVOIR
    }

    @Then("verifier un lien {string} apparaît au dessous l'article")
    public void verifierUnLienApparaîtAuDessousLArticle(String arg0) {
        driver.getPageSource().contains("Basket Totals");
        driver.quit();
    }



    @Then("verifier un lien VIEW BASKET apparaît au dessous l'article")
    public void verifierUnLienVIEWBASKETApparaîtAuDessousLArticle() {
        driver.getPageSource().contains("Basket Totals");
        driver.quit();
    }
}
