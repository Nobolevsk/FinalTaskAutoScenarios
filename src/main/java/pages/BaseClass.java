package pages;

import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver = new ChromeDriver();
    org.openqa.selenium.support.ui.Wait<WebDriver> wait = new WebDriverWait(driver,5);

    public WebDriver getDriver() {
        return driver;
    }

}
