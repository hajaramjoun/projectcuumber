package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Shop;

public class Chekout {
    Shop shop;
    WebDriver driver;
    @Given("open shopchecout")
    public void openShopchecout() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/shop");
        driver.manage().window().maximize();
    }

    @And("Ajouter un articleChekout and open panier")
    public void ajouterUnArticleChekoutAndOpenPanier() {
       shop = new Shop(driver);
        shop.clickProduit().clickViewBasketAddBasket().clickViewBasketViewDetail();
    }

    @When("click sur  Proceed to Checkout")
    public void clickSurProceedToCheckout() {

        shop.cickChekout();
    }

    @Then("verifier le passeage  au paiement")
    public void verifierLePasseageAuPaiement() {
        Checkout checkout = new Checkout(driver);
        checkout.verifierlapagedePaiement();
        driver.quit();
    }
}
