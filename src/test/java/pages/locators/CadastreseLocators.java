package pages.locators;

import org.openqa.selenium.By;

public class CadastreseLocators {
    public static By NOMEM_COMPLETO = By.id("displayName");
    public static By EMAIL = By.id("email");
    public static By SENHA = By.id("password");
    public static By LI_E_ACEITO = By.id("privacy.gpdr");
    //By.className("custom-switch")
    public static By INSCREVA_SE = By.cssSelector("#content > div > div > div > div:nth-child(2) > form > div:nth-child(5) > div > button");
}
