package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FramesPage {

    @Step("Открыть Страницу Frames")
    public FramesPage openPage() {
        open("/frames");
        return this;
    }

    @Step("Переключение во внешний фрейм ")
    public FramesPage switchToOuterFrame() {
        switchTo().defaultContent();
        switchTo().frame("frame-outer");
        return this;
    }

    @Step("Переключение во внутренний фрейм ")
    public FramesPage switchToInnerFrame() {
        switchTo().frame("frame-inner");
        return this;
    }

    @Step("Вернуться на главную страницу")
    public FramesPage switchToMainPage() {
        switchTo().defaultContent();
        return this;
    }

    @Step("Клик 'Edit' по data-* атрибуту")
    public FramesPage clickEditByDataAttribute() {
        $("[data-action='edit']").shouldBe(visible).click();
        return this;
    }

    @Step("Клик 'Submit' по тексту")
    public FramesPage clickSubmitByText() {
        $x("//button[text()='Submit']").shouldBe(visible).click();
        return this;
    }

    @Step("Клик 'Click me' по атрибуту name")
    public FramesPage clickClickMeByName() {
        $(By.name("my-button")).shouldBe(visible).click();
        return this;
    }

    @Step("Клик 'Primary' через XPath + class")
    public FramesPage clickPrimaryByXpath() {
        $x("//button[@class='btn-class']").shouldBe(visible).click();
        return this;
    }
}