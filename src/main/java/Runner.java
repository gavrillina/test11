import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Runner {

    WebDriver driver;
    Page page;
    private static final String START_URL = "https://energy-ss.com/";


    @Test
    public void startSite() throws InterruptedException {
        driver = Driver.getDriver();
        driver.get(START_URL);
        driver.manage().window().maximize();
        page = new Page(driver);
        page.logoClick();

    }
    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
