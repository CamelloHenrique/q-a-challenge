package pages.locators;

import org.openqa.selenium.By;

public enum ScorecardIntroLocators {
    RESPONDER_AGORA(By.className("btn-primary"));
    private By by;
    ScorecardIntroLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
