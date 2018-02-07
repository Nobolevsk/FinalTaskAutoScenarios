package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YaMarket extends BaseClass {

    @FindBy(xpath = "//ul[@class = 'topmenu__list']")
    WebElement marketMenu;

    public YaMarket(WebDriver driver){
        PageFactory.initElements(driver, this);
        //this.driver = driver;
    }

    public void selectMenu2(String menuName2){
        marketMenu.findElement(By.xpath("(//a[text() = '"+menuName2+"'])[1]")).click();
    }

    public YaMarket(){
        PageFactory.initElements(BaseClass.driver, this);
    }
}
