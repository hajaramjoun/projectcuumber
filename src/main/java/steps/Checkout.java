package steps;

import org.openqa.selenium.WebDriver;

public class Checkout {
    WebDriver driver;
    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void verifierlapagedePaiement() {
        driver.getPageSource().contains("Place order");
    }
}
