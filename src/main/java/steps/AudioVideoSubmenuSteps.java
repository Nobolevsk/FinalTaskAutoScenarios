package steps;

import pages.AudioVideoSubMenu;
import ru.yandex.qatools.allure.annotations.Step;

public class AudioVideoSubmenuSteps {

    @Step("В меню 'Аудио-видео техника' кликаем на {0}")
    public void TV(String televisions){
        new AudioVideoSubMenu().selectMenu3(televisions);
    }
}
