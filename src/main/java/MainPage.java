//import com.codeborne.selenide.SelenideElement;
//import org.openqa.selenium.By;
//
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//public class MainPage {
//    private final SelenideElement next = $(By.xpath("//button/span[text()= 'Далее']"));
//    public MainPage(String url){
//        open(url);
//    }
//
//    public AutorizedPage autorization(String login, String pass){
//        $(By.xpath("//input[@type='email']")).setValue(login);
//        next.click();
//        $(By.xpath("//input[@type='password']")).setValue(pass);
//        next.click();
//        $(byText("Входящие")).shouldBe(visible);
//        return new AutorizedPage();
//    }
//
//
//}
