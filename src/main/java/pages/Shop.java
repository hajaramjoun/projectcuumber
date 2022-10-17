package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Checkout;

import java.time.Duration;

public class Shop {
    WebDriver driver;
    long TIMEOUT = 40;

    public Shop(WebDriver driver) {
        this.driver = driver;
    }

    public Shop clickAddREdame() {
        driver.findElement(By.xpath("//div[@id='content']/ul/li[7]/a[2]")).click();
//        driver.findElement(By.linkText("View Basket")).click();
        return this;
    }


    public Shop clickViewBasket() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[3]")).click();
//        lienViewBasket.click();
        return this;

    }

    public Shop clickAndroid() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement bouttonAndroid = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Android"))));
        bouttonAndroid.click();
        return this;
    }

    public Shop clickProduit() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement bouttonProdiut = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[@alt='Selenium Ruby']"))));
        bouttonProdiut.click();
        return this;
    }

    public Shop clickViewBasketAddBasket() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement bouttonViewBasketHaut = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
        bouttonViewBasketHaut.click();
        return this;
    }

    public Shop clickViewBasketViewDetail() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement bouttonViewBasketHaut = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a"))));
        bouttonViewBasketHaut.click();
        return this;
    }

    public MyAccountPage verifierladirectionVerPanier() {

        driver.getPageSource().contains("Basket Totals");
        return new MyAccountPage(driver);
    }

    public Shop ClickSuprimer() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement bouttonSupprime = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(" td.product-remove > a")));
        bouttonSupprime .click();
        return this;
    }

    public void verifierLasuppression() {
        driver.getPageSource().contains("removed");
        driver.quit();

    }

    public Shop updateQuantité() {
        driver.findElement(By.cssSelector("[title='Qty']")).click();
        driver.findElement(By.cssSelector("[title='Qty']")).clear();
        driver.findElement(By.cssSelector("[title='Qty']")).sendKeys("5");
        return this;
    }

    public Shop verifierlaQuantité() {
        driver.getPageSource().contains("5");
        return this;
    }

    public Checkout cickChekout() {

        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(TIMEOUT));
        WebElement bouttonChekout = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".wc-proceed-to-checkout >a")));
        bouttonChekout.click();
        return new Checkout(driver);
    }
}
