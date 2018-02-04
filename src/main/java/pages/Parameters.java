package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parameters extends BaseClass {

    @FindBy(xpath = "//div[@class = 'layout__col i-bem exp-filters-new-design layout__col_search-filters_visible']")
    WebElement searchParameters;

    public Parameters(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectMenu4(){
        searchParameters.findElement(By.xpath("//input[@name = 'glf-pricefrom-var']")).click();
        searchParameters.findElement(By.xpath("//input[@name = 'glf-pricefrom-var']")).sendKeys("20000");
        searchParameters.findElement(By.xpath("//label[text() = 'Samsung']")).click();
        searchParameters.findElement(By.xpath("//label[text() = 'LG']")).click();
        searchParameters.findElement(By.xpath("//button[contains(@class, 'button_action_n-filter-apply')]")).click();

    }
}
