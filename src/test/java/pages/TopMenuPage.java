package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TopMenuPage {

    private final SelenideElement topMenu = $x("//ul[@class='top-menu']/li/a/img");
    private final SelenideElement accounts = $x("//a[@href='/customer/accounts']");
    private final SelenideElement deposits = $x("//a[@href='/customer/deposits']");
    private final SelenideElement domesticTransfers = $x("//a[@href='/customer/domestic-transfers']");
    private final SelenideElement exchangeControl = $x("//a[@href='/customer/exchange-control']");
    private final SelenideElement cards = $x("//a[@href='/customer/cards']");
    private final SelenideElement credits = $x("//a[@href='/customer/credits']");
    private final SelenideElement fortex = $x("//a[@href='/customer/fortex']");
    private final SelenideElement applications = $x("//a[@href='/customer/applications']");
    private final SelenideElement internationalTransfers = $x("//a[@href='/customer/international-transfers']");
    private final SelenideElement internalTransfers = $x("//a[@href='/customer/internal-transfers']");
    private final SelenideElement p2pTransfers = $x("//a[@href='/customer/p2p-transfers']");

    public TopMenuPage openAccounts(){
        topMenu.click();
        accounts.click();
        return this;
    }

    public TopMenuPage openDeposits(){
        topMenu.click();
        deposits.click();
        return this;
    }

    public TopMenuPage openExchangeControl(){
        topMenu.click();
        exchangeControl.click();
        return this;
    }


    public TopMenuPage openCards(){
        topMenu.click();
        cards.click();
        return this;
    }

    public TopMenuPage openCredits(){
        topMenu.click();
        credits.click();
        return this;
    }

    public TopMenuPage openFortex(){
        topMenu.click();
        fortex.click();
        return this;
    }

    public TopMenuPage openApplications(){
        topMenu.click();
        applications.click();
        return this;
    }

    public TopMenuPage openDomesticTransfers(){
        topMenu.click();
        domesticTransfers.click();
        return this;
    }

    public TopMenuPage openInternationalTransfers(){
        topMenu.click();
        internationalTransfers.click();
        return this;
    }

    public TopMenuPage openInternalTransfers(){
        topMenu.click();
        internalTransfers.click();
        return this;
    }

    public TopMenuPage openP2pTransfers(){
        topMenu.click();
        p2pTransfers.click();
        return this;
    }

}
