package pageObjects;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class InstagramTest {
    static ChromeDriver driver;
    static Instagram instagram;

    @BeforeAll
    public static void  before() {
        System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        instagram = new Instagram(driver);
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
        instagram.login("pontodogameplay","agathaluiza1512199322022011");
        Thread.sleep(5000);
    }

    @AfterAll
    public void close() {
        driver.close();
    }
}