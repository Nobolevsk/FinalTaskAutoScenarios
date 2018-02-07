package steps;

import pages.YaMarket;
import ru.yandex.qatools.allure.annotations.Step;

public class YaMarketSteps {

    @Step("Кликаем на странице яндекс.маркет на кнопку {0}")
    public void Electronika(String electronic){
        new YaMarket().selectMenu2(electronic);
    }
}
