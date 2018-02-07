package steps;

import org.openqa.selenium.WebDriver;
import pages.Parameters;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseStepsTest.driver;


public class ParametersSteps {

    public static WebDriver getDriver(){
        return driver;
    }

    @Step("На странице телевизоров выбираем параметры поиска и производителя")
    public void tvparameters(){
        new Parameters().selectMenu4();
    }

    @Step("Проверяем, что на странице 12 элементов, запоминаем первое значение и вводим в поиск")
    public void tvvalid(){
        new Parameters().countElements();
    }
}
