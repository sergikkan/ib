package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement billField = $x("//div[@class='c-bills-top']");
    private final SelenideElement depositField = $x("//h2[text()='Депозиты']/../..//div[@class='c-credit-top']");
   // private final SelenideElement creditField = $x("//div[@class='c-bills-top']");
    private final SelenideElement cardField = $x("//div[@class='c-card-content']");

    private final SelenideElement logOutButton = $x("//span[text()='Выход']");


    public MainPage checkThatLogedIn(){
        logOutButton.shouldBe(Condition.visible);
        return this;
    }
    public MainPage checkBillsExist(){
        billField.shouldBe(Condition.visible);
        return this;
    }

    public MainPage checkCardsExist(){
        cardField.shouldBe(Condition.visible);
        return this;
    }

    public MainPage checkDepositsExist(){
        depositField.shouldBe(Condition.visible);
        return this;
    }


}
