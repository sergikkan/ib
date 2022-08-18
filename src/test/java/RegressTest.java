import org.junit.Test;

public class RegressTest extends BaseTest{
    private final static String BASE_URL = "https://customer-qa.anthill.fortebank.com/customer/login";
    private final static String LOGIN = "77719800028";
    private final static String PASSWORD = "Qwert123!";
    private final static String COMPANY = "ТОО КЕЗБИ";
    private final static String OTP = "111111";

    @Test
    public void autorizationTest(){
        authPage.openUrl(BASE_URL)
                .fillLoginAndPass(LOGIN, PASSWORD)
                //.choseCompany(COMPANY)
                .fillOtp(OTP);
        mainPage.checkThatLogedIn();
    }

    @Test
    public void mainPageTest(){
        authPage.openUrl(BASE_URL)
                .fillLoginAndPass(LOGIN, PASSWORD)
                //.choseCompany(COMPANY)
                .fillOtp(OTP);
        mainPage.checkThatLogedIn()
                .checkBillsExist()
                .checkCardsExist()
                .checkDepositsExist();
        topMenu.openDomesticTransfers();
    }

    @Test
    public void domesticTraTest(){
        authPage.openUrl(BASE_URL)
                .fillLoginAndPass(LOGIN, PASSWORD)
                //.choseCompany(COMPANY)
                .fillOtp(OTP);
        mainPage.checkThatLogedIn()
                .checkBillsExist()
                .checkCardsExist()
                .checkDepositsExist();
        topMenu.openAccounts()
                .openDeposits()
                .openExchangeControl()
                .openCards()
                .openCredits()
                .openFortex()
                .openApplications()
                .openDomesticTransfers()
                .openInternationalTransfers()
                .openInternalTransfers()
                .openP2pTransfers();
    }


}
