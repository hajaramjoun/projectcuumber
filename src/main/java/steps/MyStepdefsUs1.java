package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SetTeardown;

public class MyStepdefsUs1  {
    WebDriver driver;
    String email;
    HomePage homePage;
    MyAccountPage myAccountPage;



    @Given("site web")
    public void siteWeb() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }



    @When("click MyAccount")
    public void clickMyAccount() {


        //Act
        homePage = new HomePage(driver);
        homePage.clickMyAccount();


    }

    @When("Remplire le mail et le mot de passe et  regitrer et Le mot de passe doit être composé à minima de {int} caractères et contenir à minima une majuscule, une minuscule, un chiffre et un caractère spécial")
    public void remplireLeMailEtLeMotDePasseEtRegitrerEtLeMotDePasseDoitÊtreComposéÀMinimaDeCaractèresEtContenirÀMinimaUneMajusculeUneMinusculeUnChiffreEtUnCaractèreSpécial(int arg0) {
       myAccountPage = new MyAccountPage(driver);
        //Arrange
        double rand = Math.random();
        String email = "jinane" + rand + ".basraoui@gmail.com";
        String psw = "123456789azyte123 ";
        this.email = email;
        myAccountPage.remplireformulaireregistre(email, psw);
    }


    @Then("le compte est bien créer")
    public void leCompteEstBienCréer() {
        String helloWord = myAccountPage.verifierCreationDeCompte();
        helloWord.contains("Hello" + email);
        driver.quit();
    }


    @And("logout")
    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }


}
