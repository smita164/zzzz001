import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class asd123 {
    protected static WebDriver driver;
    public static void main(String[] args) {
        //declaration and instantiation of object/variables
        //copy deiver path
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe ");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //url
        driver.get("https://github.com/");
    }
}