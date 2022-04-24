package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InstagramLoginSave {
    private ChromeDriver driver;

    public InstagramLoginSave(ChromeDriver driver) {
        this.driver = driver;
    }

    public void noSavingLogin() {
        driver.findElement(By.className("cmbtv")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
