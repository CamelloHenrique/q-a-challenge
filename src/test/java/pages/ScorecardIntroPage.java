package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.ScorecardIntroLocators;

public class ScorecardIntroPage {
    private WebDriver driver;
    public ScorecardIntroPage(WebDriver driver) {
        this.driver = driver;
    }

    public ScorecardSkillsPage responderAgoraClick(){
        driver.findElement(ScorecardIntroLocators.RESPONDER_AGORA).click();
        return new ScorecardSkillsPage(driver);
    }
}
