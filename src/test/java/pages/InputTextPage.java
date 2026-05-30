package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InputTextPage {
    private final SelenideElement inputField = $("#newButtonName");
    private final SelenideElement updatingButton = $("#updatingButton");

    @Step("Открыть страницу Text Input")
    public InputTextPage openPage() {
        open("/textinput");
        return this;
    }

    @Step("Ввести имя для кнопки: {newName}")
    public InputTextPage enterNewButtonName(String newName) {
        inputField.shouldBe(visible).setValue(newName);
        return this;
    }

    @Step("Нажать на обновляемую кнопку")
    public InputTextPage clickUpdatingButton() {
        updatingButton.shouldBe(visible).click();
        return this;
    }

    @Step("Проверить, что текст на кнопке изменился на {expectedText}")
    public void verifyButtonText(String expectedText) {
        updatingButton.shouldHave(text(expectedText));
    }
}
