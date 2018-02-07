package steps;

import pages.FrontMainMenu;
import ru.yandex.qatools.allure.annotations.Step;

public class FrontMainMenuSteps {

    @Step("Нажимаем в основном меню на кнопку {0}")
    public void Market (String market){
        new FrontMainMenu().selectMenu1(market);
    }
}
