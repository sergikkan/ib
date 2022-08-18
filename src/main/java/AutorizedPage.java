//import org.openqa.selenium.By;
//
//import static com.codeborne.selenide.Condition.exist;
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.sleep;
//
//public class AutorizedPage {
//
//    public AutorizedPage fillEmailAndText(String email, String text){
//        $(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
//        $(By.xpath("//textarea[@aria-label='Кому']")).setValue(email);
//        $(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).setValue(text);
//        return new AutorizedPage();
//    }
//
//    public AutorizedPage sendMessage(){
//        $(By.xpath("//div[@class='dC']")).click();
//        return new AutorizedPage();
//    }
//
//    public AutorizedPage checkThatMessageSent(String email, String text){
//        $(By.xpath("//div[@data-tooltip='Отправленные']")).click();
//        $(By.xpath("//div[@role='main']//tbody/tr[1]//div[text()='Кому: ']/span[@email=\""+email+"\"]")).shouldBe(exist);
//        $(By.xpath("//div[@role='main']//tbody/tr[1]/td[5]")).click();
//        $(By.xpath("//div[text()=\'"+text+"\']")).shouldBe(exist);
//        return new AutorizedPage();
//    }
//
//    public AutorizedPage addSign(String name, String text) {
//        $(By.xpath("//div[@data-tooltip='Настройки']")).click();
//        $(By.xpath("//button[@aria-label='Все настройки']")).click();
//        $(By.xpath("//button[@aria-label='Создать подпись']")).click();
//        $(By.xpath("//input[@placeholder='Имя в подписи']")).setValue(name);
//        $(By.xpath("//button[@name='ok']")).click();
//        $(By.xpath("//div[@aria-label='Подпись']")).sendKeys(text);
//        $(byText("от тестового пользователя")).shouldBe(visible);
//        sleep(1000);
//        $(By.xpath("//button[@guidedhelpid='save_changes_button']")).click();
//        return new AutorizedPage();
//    }
//
//    public AutorizedPage deleteSign(String name) {
//        $(By.xpath("//div[@data-tooltip='Настройки']")).click();
//        $(By.xpath("//button[@aria-label='Все настройки']")).click();
//        $(By.xpath("//span[text()=\'"+name+"\']/../span[@data-action=\"delete\"]")).click();
//        $(By.xpath("//div[@role=\"alertdialog\"]//button[@name='ok']")).click();
//        $(By.xpath("//button[@guidedhelpid='save_changes_button']")).click();
//        return new AutorizedPage();
//    }
//
//
//    public AutorizedPage fillSign(String signName) {
//        $(By.xpath("//div[@data-tooltip='Вставить подпись']")).click();
//        $(By.xpath("//div/div[text()=\'"+signName+"\']")).click();
//        return new AutorizedPage();
//    }
//
//    public AutorizedPage checkSignInMessage(String signName) {
//        $(By.xpath("//div[text()=\'"+signName+"\']")).shouldBe(exist);
//        return new AutorizedPage();
//    }
//}
