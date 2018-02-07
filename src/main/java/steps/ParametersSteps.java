package steps;

import pages.Parameters;
import ru.yandex.qatools.allure.annotations.Step;

public class ParametersSteps {

    @Step("На странице телевизоров выбираем параметры поиска и производителя")
    public void TVParameters(){
        new Parameters().selectMenu4();
    }

    @Step("Проверяем, что на странице 12 элементов, запоминаем первое значение и вводим в поиск")
    public void TVValid(){
        new Parameters().countElements();
    }
}
