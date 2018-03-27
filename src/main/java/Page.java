import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page extends Waiter {

    public Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='logo']")
    private WebElement logo;

    private Logger logger;


    public void isLogoDisplayed() {

        if (logo.isDisplayed()) {
            logger.info("site is working");
        }
    }

    public void logoClick() throws InterruptedException {
        Thread.sleep(500);
        logo.click();

    }

}
