import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.Steps;
abstract public class BaseTest implements Steps{
    @BeforeMethod(description = "Настройки webdriver")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }
    @BeforeMethod(description = "Вызов настроек")
    public void init(){
        setUp();
    }

    @AfterMethod(description = "Закрытие webdriver")
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
