package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudioVideoSubMenu extends BaseClass {

    @FindBy(xpath = "(//div[@class = 'catalog-menu__list'])[3]")
    WebElement TVmenu;

    public AudioVideoSubMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


     public void selectMenu3 (String menuName3) {
         TVmenu.findElement(By.xpath("(//a[text() = '" + menuName3 + "'])[2]")).click();
     }
}
