package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Basket;
import pages.HomePage;
import pages.Shop;

public class VerifierDetail {
    WebDriver driver;
    Shop shop;
    @Given("open shop")
    public void openShop() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/shop");
        driver.manage().window().maximize();
      ;
    }

    @And("Ajouter un article et ouvrire la page de panier")
    public void ajouterUnArticle() {
       shop = new Shop(driver);
        shop.clickProduit().clickViewBasketAddBasket().clickViewBasketViewDetail();
    }

    @Then("verifier que des articles ajoutés spécifiant la quantité, le prix unitaire et le prix total")
    public void verifierQueDesArticlesAjoutésSpécifiantLaQuantitéLePrixUnitaireEtLePrixTotal() {
        Basket basket = new Basket(driver);
        basket.verifierElementDetail();
        driver.quit();

    }

    }

