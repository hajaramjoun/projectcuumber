package steps;

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


public class FilterTemeUs7 {

    HomePage homePage;
    WebDriver driver;

    @Given("ouvrir la page shope")
    public void ouvrirLaPageShope() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickShop();
    }

    @When("cliquer sur android")
    public void cliquerSurAndroid() {
        driver.findElement(By.linkText("Android")).click();
    }



    @Then("verifier afficher le resultat")
    public void verifierAfficherLeResultat() {
        driver.getPageSource().contains("Android Quick Start Guide");
        driver.quit();
    }



}

