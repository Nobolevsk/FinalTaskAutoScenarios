package steps;

import org.openqa.selenium.WebDriver;
import pages.AudioVideoSubMenu;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseStepsTest.driver;

public class AudioVideoSubmenuSteps {

    public static WebDriver getDriver(){
        return driver;
    }

    @Step("В меню 'Аудио-видео техника' кликаем на {0}")
    public void tv(String televisions){
        new AudioVideoSubMenu().selectMenu3(televisions);
    }
}
