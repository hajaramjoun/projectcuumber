package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Basket;
import pages.Shop;

public class VeiwBasquet {
    WebDriver driver;
    Shop shop;
    @Given("ouvrire la page shop")
    public void ouvrireLaPageShop() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/shop");
        driver.manage().window().maximize();
    }

    @When("cliquer sur le prodiut")
    public void cliquerSurLeProdiut() {
       shop = new Shop(driver);
       shop.clickProduit();

    }

    @And("cliquer sur le bouton Add Basket et view basket")
    public void cliquerSurLeBoutonVIEWBASKET() {
        shop.clickViewBasketAddBasket().clickViewBasketViewDetail();

    }

    @Then("se rediriger  l'espace panier.")
    public void seRedirigerLEspacePanier() {
        shop.verifierladirectionVerPanier();
        driver.quit();

    }



}
