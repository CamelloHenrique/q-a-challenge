package pages.locators;

import org.openqa.selenium.By;

public enum CadastreseLocators {
    NOMEM_COMPLETO(By.id("displayName")),
    EMAIL(By.id("email")),
    SENHA(By.id("password")),
    LI_E_ACEITO(By.id("privacy.gpdr")),//custom-control-label
    //By.className("custom-switch")
    INSCREVA_SE(By.className("align-items-center mb-5 space-top-1"));//

    private By by;
    CadastreseLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
