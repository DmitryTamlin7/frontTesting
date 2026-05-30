package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InputTextPage;


@Epic("UI Automation")
@Feature("Input Test")
public class InputText extends  BaseTest{

    private final InputTextPage textInputPage = new InputTextPage();

    @Test
    @Story("Динамическое изменение текста элементов")
    @DisplayName("Изменение названия кнопки через текстовый ввод")
    @Description("После ввода текста в инпут и клика по кнопке название меняется на введенное значение")
    void changeButtonNameTest() {
        String targetText = "NewNAmeButton";

        textInputPage.openPage()
                .enterNewButtonName(targetText)
                .clickUpdatingButton()
                .verifyButtonText(targetText);
    }
}
