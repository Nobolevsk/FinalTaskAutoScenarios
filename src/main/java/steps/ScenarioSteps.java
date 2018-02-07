package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    FrontMainMenuSteps mainMenuSteps = new FrontMainMenuSteps();
    YaMarketSteps yaMarketSteps = new YaMarketSteps();
    AudioVideoSubmenuSteps submenuSteps = new AudioVideoSubmenuSteps();
    ParametersSteps parametersSteps = new ParametersSteps();


    @When("^Нажимаем на кнопку \"(.*)\"$")
    public void MenuStep(String first){
        mainMenuSteps.Market(first);
    }
    @Then("^Кликаем на сабменю\"(.*)\"$")
    public void MarketStep(String second){
        yaMarketSteps.Electronika(second);
    }

    @When("^Выбираем пункт Телевизоры \"(.*)\"$")
    public void TVstep(String third){
        submenuSteps.TV(third);
    }
    @Then("Выбираем параметры поиска и производителя для телевизора")
    public void ParameterStep1(){
        parametersSteps.TVParameters();
    }
    @Then("На странице 12 элементов, запоминаем первое и вставляем в поисковую строку")
    public void ParameterStep2(){
        parametersSteps.TVValid();
    }
}
