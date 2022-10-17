package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Shop;

public class SupprimerProdit {
    Shop shop;

    WebDriver driver;
    @Given("ouvrir shop")
    public void ouvrirShop() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/shop");
        driver.manage().window().maximize();
    }



    @And("Ajouter un article   and ouvrire la page de panier")
    public void ajouterUnArticleAndOuvrireLaPageDePanier() {
        shop = new Shop(driver);
        shop.clickProduit().clickViewBasketAddBasket().clickViewBasketViewDetail();
    }

    @When("Chaque article peut être supprimé par un bouton")
    public void chaqueArticlePeutÊtreSuppriméParUnBouton() {
        shop.ClickSuprimer();

    }


    @Then("verifier que des articles est bien supprimer")
    public void verifierQueDesArticlesEstBienSupprimer() {
        shop.verifierLasuppression();
        driver.quit();

    }

}
