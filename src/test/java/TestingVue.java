
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



class TestingVue {
    static ChromeDriver driver;
    @BeforeAll
    public static void  before() {
        System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testingPicInsert() {

        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        driver.findElement(By.linkText("Cadastro")).click();
        System.out.println("Informe uma nova imagem ao" + driver.getTitle());
        driver.findElement(By.id("titulo")).sendKeys("Foto para teste de automação");
        driver.findElement(By.id("url")).sendKeys("https://upload.wikimedia.org/wikipedia/commons/d/d5/Selenium_Logo.png");
        driver.findElement(By.id("descricao")).sendKeys("Teste de automação para salvamento de imagem");
        driver.findElement(By.id("gravar")).click();
        System.out.println("Foto salva no" + driver.getTitle());
        driver.findElement(By.linkText("Home")).click();

    }
}