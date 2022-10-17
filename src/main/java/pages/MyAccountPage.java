package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MyAccountPage {
    private final int TIMEOUT = 20;

    private WebDriver driver;
    private By idSelectorRegEmail = By.id("reg_email");
    private By idSelectorUsernameLogin = By.id("username");
    private By idSelectorRegistrePassword = By.id("reg_password");

    private By idSelectorPasswordLogin = By.id("password");

    private By nameSelectorRegistre = By.name("register");
    private By nameSelectorLogin = By.name("login");

    private By cssSelectorStroung = By.cssSelector("strong");
    By cssSelectorFileAriane = By.cssSelector("div.woocommerce > nav > ul>li");
    By cssSelectorFileArianeDashbord = By.cssSelector("div.woocommerce > nav > ul>li:nth-child(1)");
    By cssSelectorFileArianeOrders = By.cssSelector("div.woocommerce > nav > ul>li:nth-child(2)");
    By cssSelectorFileArianeDownloads = By.cssSelector("div.woocommerce > nav > ul>li:nth-child(3)");
    By cssSelectorFileArianeAddresses = By.cssSelector("div.woocommerce > nav > ul>li:nth-child(4)");
    By cssSelectorFileArianeAccountDetails = By.cssSelector("div.woocommerce > nav > ul>li:nth-child(5)");
    By cssSelectorFileArianeAccountLogout = By.cssSelector("div.woocommerce > nav > ul>li:nth-child(6)");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public MyAccountPage remplireformulaireregistre(String email, String psw) {

        //// Remplire le champs E-mail
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement inputRegEmail = wait.until(ExpectedConditions.elementToBeClickable(idSelectorRegEmail));
        inputRegEmail.click();
        inputRegEmail.clear();
        inputRegEmail.sendKeys(email);

        //// Remplire le champs password
        WebElement inputRegPassword = wait.until(ExpectedConditions.elementToBeClickable(idSelectorRegistrePassword));
        inputRegPassword.click();
        inputRegPassword.clear();
        inputRegPassword.sendKeys(psw);

        WebElement boutonRegistre = driver.findElement(nameSelectorRegistre);
        boutonRegistre.click();
        return this;

    }

    public MyAccountPage remplirEtValiderLeformulaireLogin(String email, String psw) {

        //// Remplire le champs username or email
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement inputRegEmail = wait.until(ExpectedConditions.elementToBeClickable(idSelectorUsernameLogin));
        inputRegEmail.click();
        inputRegEmail.clear();
        inputRegEmail.sendKeys(email);

        //// Remplire le champs password
        WebElement inputRegPassword = wait.until(ExpectedConditions.elementToBeClickable(idSelectorPasswordLogin));
        inputRegPassword.click();
        inputRegPassword.clear();
        inputRegPassword.sendKeys(psw);

        WebElement boutonLogin = driver.findElement(nameSelectorLogin);
        boutonLogin.click();
        return this;
    }

    public String verifierCreationDeCompte() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement ElementSelectorStroung = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorStroung));
        return ElementSelectorStroung.getText();
    }

    public List<String> verifierDashboardLiens() {
        List<String> list = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));

        WebElement ElementSelectorDashbord = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFileArianeDashbord));
        list.add(ElementSelectorDashbord.getText());

        WebElement ElementSelectorOrders = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFileArianeOrders));
        list.add(ElementSelectorOrders.getText());

        WebElement ElementSelectorDownloads = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFileArianeDownloads));
        list.add(ElementSelectorDownloads.getText());

        WebElement ElementSelectorAddresses = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFileArianeAddresses));
        list.add(ElementSelectorAddresses.getText());

        WebElement ElementSelectorAccountDetails = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFileArianeAccountDetails));
        list.add(ElementSelectorAccountDetails.getText());

        WebElement ElementSelectorAccountLogout = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorFileArianeAccountLogout));
        list.add(ElementSelectorAccountLogout.getText());

        ;
        return list;

    }
    public MyAccountPage clickLougout(){
        driver.findElement(By.linkText("Logout")).click();
        return this;
    }
}
