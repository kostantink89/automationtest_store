package base;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;


public class BasePage {

    protected static WebDriver driver;
    protected static Logger log = LogManager.getLogger();
    private static Properties prop = new Properties();


    @BeforeTest
    public void setup() throws IOException {
        FileInputStream input = new FileInputStream("/IT/Projects/Intellij_IDEA/automationtest_store/src/main/java/config/config.properties");
        prop.load(input);
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/webdrivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.edge.driver", "src/main/resources/webdrivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://automationteststore.com/");


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public void takeSnapShot(String name) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destFile = new File("C:\\IT\\Tools\\Screenshots\\" + timeStamp() + ".png");

        FileUtils.copyFile(srcFile, destFile);
    }

    public static String timeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}


