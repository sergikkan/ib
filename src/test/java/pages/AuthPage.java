package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница авторизации
 * */
public class AuthPage {
    private final SelenideElement loginField = $x("//input[@id='log-name']");
    private final SelenideElement passwordField = $x("//input[@id='log-pass']");
    private final SelenideElement authButton = $x("//button[@id='auth-login']");
    private final SelenideElement codeField = $x("//label[text()='Код']/../input[@id='log-pass']");
    private final SelenideElement codeSubmit = $x("//label[text()='Код']/..//button[@id='auth-login']");




    public AuthPage openUrl(String url){
        Selenide.open(url);
        return this;
    }

    public AuthPage fillLoginAndPass(String login, String password){
        loginField.setValue(login);
        passwordField.setValue(password);
        authButton.click();
        return this;
    }

    public AuthPage choseCompany(String company){
        $x("//div[text()=\"" + company + "\"]").click();
        return this;
    }
    public AuthPage fillOtp(String code){
        codeField.setValue(code);
        codeSubmit.click();
        return this;
    }

}
