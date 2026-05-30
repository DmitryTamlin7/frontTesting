package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FramesPage {

    private final SelenideElement outFrame = $("#frame_1");
    private final SelenideElement innerFrame = $("#frame_2");

    @Step("Открыть Страницу Frames")
    public FramesPage openPage(){
        open("/frames");
        return this;
    }

    @Step("Переключение во внешний фрейм")
    public FramesPage switchToOuterFrame(){
        switchTo().frame(outFrame.shouldBe(visible));
        return this;
    }


    @Step("Переключение во внутренний фрейм")
    public FramesPage switchToInnerFrame(){
        switchTo().frame(innerFrame.shouldBe(visible));
        return this;
    }


    @Step("Выйти из всех фреймов")
    public FramesPage switchToDefaultContent(){
        switchTo().defaultContent();
        return this;
    }

    @Step("Клик кнопки 'Edit' по атрибуту data-*")
    public FramesPage clickEditButtonByDataAttribute(){
        $("button[data-action='edit']").shouldBe(visible).click();
        return this;
    }

    @Step("Клик кнопки 'Submit' по атрибуту name")
    public FramesPage clickSubmitButtonByName(){
        $(By.name("submit")).shouldBe(visible).click();
        return this;
    }

    @Step("Клик кнопки 'Click' по тексту")
    public FramesPage clickClickButtonByText(){
        $x("//button[text()='Click me']").shouldBe(visible).click();
        return this;
    }

    @Step("Клик кнопки 'Primary' через XPath с классом")
    public FramesPage clickPrimaryByXpath(){
        $x("//button[contains(@class, 'btn-primary')]").shouldBe(visible).click();
        return this;
    }
}


