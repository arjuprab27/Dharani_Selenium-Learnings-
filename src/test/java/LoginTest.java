import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    
    @BeforeSuite
    public void Launch() {
    	driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setUp() {
        
        driver.manage().window().maximize();
    }

    @Test
    public void launchApplication() {
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}