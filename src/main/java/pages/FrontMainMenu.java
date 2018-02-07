package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.*;

public class FrontMainMenu extends BaseClass {

    @FindBy (xpath = "//div[@class = 'home-arrow__tabs']")
    WebElement menuItem1;

    public FrontMainMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
        //this.driver = driver;
    }

    public void selectMenu1(String menuName1){
        menuItem1.findElement(By.xpath("//div[@role = 'navigation']/a[text() = '"+menuName1+"']")).click();
    }

    public FrontMainMenu(){
        PageFactory.initElements(BaseClass.driver, this);
    }

}
