package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SampleAppPage {

    private final SelenideElement usernameInput = $("input[name='UserName']");
    private final SelenideElement passwordInput = $("input[name='Password']");
    private final SelenideElement loginButton = $("#login");
    private final SelenideElement loginStatus = $("#loginstatus");

    @Step("Открыть страницу Sample App")
    public SampleAppPage openPage() {
        open("/sampleapp");
        return this;
    }

    @Step("Ввести имя пользователя: {username}")
    public SampleAppPage enterUsername(String username){
        usernameInput.shouldBe(visible).setValue(username);
        return this;
    }

    @Step("Ввести пароль: {password}")
    public SampleAppPage enterPassword(String password){
        passwordInput.shouldBe(visible).setValue(password);
        return this;
    }

    @Step("Нажать кнопку Log In")
    public SampleAppPage clickLogin(){
        loginButton.shouldBe(visible).click();
        return this;
    }

    @Step("Проверка успешной аутентификации")
    public SampleAppPage verifyLoginStatus(String expectedUsername){
        loginStatus.shouldBe(visible).shouldHave(text("Welcome, " + expectedUsername + "!"));
        loginStatus.shouldHave(cssClass("text-success"));
        return this;
    }

}
