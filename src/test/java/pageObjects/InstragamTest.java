package pageObjects;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class InstagramTest {
    static ChromeDriver driver;
    static InstagramLogin instagram;

    @BeforeAll
    public static void  before() {
        System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        instagram = new InstagramLogin(driver);
    }
    @Test
    @Order(1)
    public void openingInstagram() throws InterruptedException {
        instagram.open();
        Thread.sleep(5000);
    }
    @Test
    @Order(2)
    public void login() throws InterruptedException {
        InstagramLoginSave instagramLoginSave = instagram.login("pontodogameplay","agathaluiza1512199322022011");
        InstagramFeed instagramFeed = instagramLoginSave.noSavingLogin();
        Thread.sleep(5000);
        instagramFeed.noNotifications();
        Thread.sleep(15000);
    }

    @AfterAll
    public static void close() {
        driver.close();
    }
}