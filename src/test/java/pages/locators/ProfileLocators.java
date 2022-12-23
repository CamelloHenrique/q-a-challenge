package pages.locators;

import org.openqa.selenium.By;

public class ProfileLocators {
    public static By NOME_COMPLETO = By.id("displayName");
    public static By QA_TESTES = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div.row.mx-gutters-2.mt-2.row > div:nth-child(7) > div > div");
    public static By SUAS_HABILIDADES = By.className("css-yk16xz-control");
    public static By EXPERIENCIA_GERAL = By.cssSelector("#years_experience");
    public static By MOMOENTO_PROFISSIONAL = By.cssSelector("#preferences\\.job_search");
    public static By WHATSAPP = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(6) > div:nth-child(2) > div:nth-child(2) > div > input");
    public static By CIDADE = By.cssSelector("#address\\.city");
    public static By REMOTA = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(7) > div > div:nth-child(2) > label");
    public static By PRESENCIAL = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(7) > div > div:nth-child(3) > label");
    public static By HIBRIDA = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(7) > div > div.is-invalid.form-check.form-check-inline > label");
    public static By PROXIMO = By.cssSelector("#footer-portal > div > div > button");

}
