package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class InstagramLogin {
    private ChromeDriver driver;
    public InstagramLogin(ChromeDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("https://www.instagram.com/");
    }

    public List < WebElement > booleanDisplay() {
      return driver.findElements(By.cssSelector("\"--desktop-nav-height:60px; --in-feed-story-item-padding:14px;\""));//.isDisplayed();

    }

    public InstagramLoginSave login(String user, String password) {
        WebElement userNameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        userNameField.sendKeys(user);
        passwordField.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
        loginButton.click();
        return new InstagramLoginSave(driver);
    }




}
