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



    public void likingPictures() {
        driver.findElement(By.linkText("/explore")).click();
        driver.findElement(By.className("eLAPa")).click();
        driver.findElement(By.xpath("M16.792 3.904A4.989 4.989 0 0121.5 9.122c0 3.072-2.652 4.959-5.197 7.222-2.512 2.243-3.865 3.469-4.303 3.752-.477-.309-2.143-1.823-4.303-3.752C5.141 14.072 2.5 12.167 2.5 9.122a4.989 4.989 0 014.708-5.218 4.21 4.21 0 013.675 1.941c.84 1.175.98 1.763 1.12 1.763s.278-.588 1.11-1.766a4.17 4.17 0 013.679-1.938m0-2a6.04 6.04 0 00-4.797 2.127 6.052 6.052 0 00-4.787-2.127A6.985 6.985 0 00.5 9.122c0 3.61 2.55 5.827 5.015 7.97.283.246.569.494.853.747l1.027.918a44.998 44.998 0 003.518 3.018 2 2 0 002.174 0 45.263 45.263 0 003.626-3.115l.922-.824c.293-.26.59-.519.885-.774 2.334-2.025 4.98-4.32 4.98-7.94a6.985 6.985 0 00-6.708-7.218z")).click();
        driver.findElement(By.className("NOTWr")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void homeNHandScrollDown() {
        driver.findElement(By.className("XrOey")).click();
        driver.navigate();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-550)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
}
