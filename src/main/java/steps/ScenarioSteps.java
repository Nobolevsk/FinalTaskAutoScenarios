package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    FrontMainMenuSteps mainMenuSteps = new FrontMainMenuSteps();
    YaMarketSteps yaMarketSteps = new YaMarketSteps();
    AudioVideoSubmenuSteps submenuSteps = new AudioVideoSubmenuSteps();
    ParametersSteps parametersSteps = new ParametersSteps();


    @When("^Нажимаем на кнопку \"(.*)\"$")
    public void menuStep(String first){
        mainMenuSteps.market(first);
    }
    @Then("^Кликаем на сабменю\"(.*)\"$")
    public void marketStep(String second){
        yaMarketSteps.electronika(second);
    }

    @When("^Выбираем пункт Телевизоры \"(.*)\"$")
    public void tvstep(String third){
        submenuSteps.tv(third);
    }
    @Then("Выбираем параметры поиска и производителя для телевизора")
    public void parameterStep1(){
        parametersSteps.tvparameters();
    }
    @Then("На странице 12 элементов, запоминаем первое и вставляем в поисковую строку")
    public void parameterStep2(){
        parametersSteps.tvvalid();
    }
}
