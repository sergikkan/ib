import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import pages.AuthPage;
import pages.DomesticTransfersPage;
import pages.MainPage;
import pages.TopMenuPage;


public class BaseTest {

    protected AuthPage authPage =new AuthPage();
    protected MainPage mainPage= new MainPage();
    protected TopMenuPage topMenu = new TopMenuPage();
    protected DomesticTransfersPage domesticTransfers = new DomesticTransfersPage();


    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }



    static {
        Configuration.browser = "chrome"; //firefox, edge,opera, ie
        //Configuration.baseUrl = "https://customer-qa.anthill.fortebank.com/customer/login";
        Configuration.timeout= 160000;
        Configuration.browserSize = "1920x1080";
       // Configuration.headless = true;
        Configuration.holdBrowserOpen = true;
        }

}
