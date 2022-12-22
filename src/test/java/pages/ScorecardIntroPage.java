package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.ScorecardIntroLocators;

public class ScorecardIntroPage {
    private WebDriver driver;
    private By responderAgora = ScorecardIntroLocators.RESPONDER_AGORA.getBy();
    public ScorecardIntroPage(WebDriver driver) {
        this.driver = driver;
    }

    public ScorecardSkillsPage responderAgoraClick(){
        driver.findElement(responderAgora).click();
        return new ScorecardSkillsPage(driver);
    }
}
