package pages.locators;

import org.openqa.selenium.By;

public enum LoginLocators {
    CADASTRE_SE(By.className("small"));
    private By by;
    LoginLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
