package pages.locators;

import org.openqa.selenium.By;

public enum ProfileLocators {
    NOME_COMPLETO(By.id("displayName")),
    BACK_END_DEVELOPER(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div.row.mx-gutters-2.mt-2.row > div:nth-child(1) > div > div")),
    MOBILE_DEVELOPER(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div.row.mx-gutters-2.mt-2.row > div:nth-child(4) > div > div")),
    QA_TESTES(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div.row.mx-gutters-2.mt-2.row > div:nth-child(7) > div > div")),
    SUAS_HABILIDADES(By.className("css-yk16xz-control")),
    EXPERIENCIA_GERAL(By.cssSelector("#years_experience")),
    MOMOENTO_PROFISSIONAL(By.cssSelector("#preferences\\.job_search")),
    WHATSAPP(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(6) > div:nth-child(2) > div:nth-child(2) > div > input")),
    CIDADE(By.cssSelector("#address\\.city")),
    REMOTA(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(7) > div > div:nth-child(2) > label")),
    PRESENCIAL(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(7) > div > div:nth-child(3) > label")),
    HIBRIDA(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.p-0.tab-pane.active.show > form > div:nth-child(7) > div > div.is-invalid.form-check.form-check-inline > label")),
    PROXIMO(By.cssSelector("#footer-portal > div > div > button"));

    private By by;
    ProfileLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
