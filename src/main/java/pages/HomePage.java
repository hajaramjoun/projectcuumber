package pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage<HomePage> {
    private WebDriver driver;
    private final int TIMEOUT_COOKIE = 20;

    private By cssSelectorMyAccount = By.linkText("My Account");



    public HomePage(WebDriver driver) {
        this.driver = driver;

    }


    /////////////////////********************/////////- clickMyAccoun///////////////////////////////////////////


    public MyAccountPage clickMyAccount() {

        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement bouttonMyAccount = wait.until(ExpectedConditions.elementToBeClickable(cssSelectorMyAccount));
        bouttonMyAccount.click();
        return new MyAccountPage(driver);

    }
    public  Shop clickShop(){
        driver.findElement(By.linkText("Shop")).click();
        return new Shop(driver);
    }



}