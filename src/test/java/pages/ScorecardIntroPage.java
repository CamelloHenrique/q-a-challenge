package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.ScorecardIntroLocators;
import pages.locators.ScorecardSkillLocators;
import utils.SeleniumUtils;

public class ScorecardIntroPage {
    private WebDriver driver;
    public ScorecardIntroPage(WebDriver driver) {
        this.driver = driver;
    }

    public ScorecardSkillsPage responderAgoraClick(){
        SeleniumUtils.esperarAteCampoVisivel(driver, ScorecardIntroLocators.RESPONDER_AGORA);
        driver.findElement(ScorecardIntroLocators.RESPONDER_AGORA).click();
        return new ScorecardSkillsPage(driver);
    }
}
