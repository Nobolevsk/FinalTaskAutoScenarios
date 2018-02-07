package steps;

import org.openqa.selenium.WebDriver;
import pages.YaMarket;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseStepsTest.driver;


public class YaMarketSteps {

    public static WebDriver getDriver(){
        return driver;
    }

    @Step("Кликаем на странице яндекс.маркет на кнопку {0}")
    public void electronika(String electronic){
        new YaMarket().selectMenu2(electronic);
    }
}
