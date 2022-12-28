package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BasePage {

    public WebDriver driver;

    @BeforeTest
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://automationteststore.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
