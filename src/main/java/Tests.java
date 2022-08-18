//
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//
//public class Tests extends BaseTest{
//
//    private final static String BASE_URL="http://gmail.com/"; //основной URL для входа в почту gmail
//    private final static String LOGIN="testselenidemessage@gmail.com"; //электроннаяя почта для авторизации
//    private final static String PASSWORD="Selenide1606"; //Пароль
//    private final static String EMAIL="sergik-199022@mail.ru"; //Почта, на которую отправляем сообщение
//    private final static String MESSAGE="Тестовое сообщение"; //Текст сообщения
//    private final static String SIGNNAME="подпись"; //название подписи
//    private final static String SIGNTEXT="от тестового пользователя"; //текст подписи
//
//    @Test
//    public void t1logInTest(){
//        new MainPage(BASE_URL)
//                .autorization(LOGIN, PASSWORD);
//
//    }
//
//    @Test
//    public void t2sendMessageTest(){
//        new MainPage(BASE_URL)
//                .autorization(LOGIN, PASSWORD)
//                .fillEmailAndText(EMAIL, MESSAGE)
//                .sendMessage();
//    }
//
//    @Test
//    public void t3checkThatMessageSentTest(){
//        new MainPage(BASE_URL)
//                .autorization(LOGIN, PASSWORD)
//                .checkThatMessageSent(EMAIL, MESSAGE);
//    }
//
//    @Test
//    public void t4addSignAndSendMessageTest(){
//        new MainPage(BASE_URL)
//                .autorization(LOGIN, PASSWORD)
//                .addSign(SIGNNAME,SIGNTEXT)
//                .fillEmailAndText(EMAIL, MESSAGE)
//                .fillSign(SIGNNAME)
//                .sendMessage()
//                .deleteSign(SIGNNAME);
//    }
//
//    @Test
//    public void t5checkThatMessageSentWithSignTest(){
//        new MainPage(BASE_URL)
//                .autorization(LOGIN, PASSWORD)
//                .checkThatMessageSent(EMAIL, MESSAGE)
//                .checkSignInMessage(SIGNTEXT);
//    }
//
//}
