package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Shop;

public class UpdateQuantite {
    WebDriver driver;
    Shop shop;
    @Given("open shopUpdate")
    public void openShopUpdate() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/shop");
        driver.manage().window().maximize();
    }

    @And("Ajouter un articleUpdate")
    public void ajouterUnArticleUpdate() {
        shop = new Shop(driver);
        shop.clickProduit().clickViewBasketAddBasket().clickViewBasketViewDetail();

    }

    @When("modifier la quantité")
    public void modifierLaQuantité() {
        shop.updateQuantité();
    }

    @Then("verifier que la quantité est bien modifier")
    public void verifierQueLaQuantitéEstBienModifier() {
        shop.verifierlaQuantité();
        driver.quit();
    }
}
