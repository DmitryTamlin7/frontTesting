package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Selenide.*;

public class ClickPage {

    private final SelenideElement badButton = $("#badButton");

    @Step("Открыть страницу Click")
    public ClickPage openPage(){
        open("/click");
        return this;
    }

    @Step("Кликнуть по мыши физически")
    public ClickPage clickBadButton(){
        actions().moveToElement(badButton.shouldBe(visible)).click().perform();
        return this;
    }

    @Step("Проверка что кнопка изменила цвет на зеленый")
    public void verifyButtonIsGreen() {
        badButton.shouldHave(cssClass("btn-success"));
    }

}
