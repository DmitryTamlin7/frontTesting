package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoadDelaysPage {

    private final SelenideElement delayedButton = $(".btn-primary");

    @Step("Открыть страницу Load Delays")
    public LoadDelaysPage openPage() {
        open("/loaddelay");
        return this;
    }

    @Step("Дождаться появления кнопки и кликнуть")
    public void clickDelayedButton() {
        delayedButton.shouldBe(visible).click();
    }



}
