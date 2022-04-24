package pageObjects;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class InstragamTest {
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