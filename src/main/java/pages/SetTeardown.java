package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetTeardown {
    WebDriver driver;

    public SetTeardown(WebDriver driver) {
        this.driver = driver;

    }
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }
    public  void  teardown(){
        driver.quit();
    }
}
