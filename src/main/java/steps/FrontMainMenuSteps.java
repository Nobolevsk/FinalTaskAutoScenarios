package steps;

import org.openqa.selenium.WebDriver;
import pages.FrontMainMenu;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseStepsTest.driver;


public class FrontMainMenuSteps {

    public static WebDriver getDriver(){
        return driver;
    }

    @Step("Нажимаем в основном меню на кнопку {0}")
    public void market(String market){
        new FrontMainMenu().selectMenu1(market);
    }


}
