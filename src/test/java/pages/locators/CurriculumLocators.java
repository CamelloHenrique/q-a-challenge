package pages.locators;

import org.openqa.selenium.By;

public enum CurriculumLocators {
    EMAIL(By.cssSelector("#__next > div:nth-child(4) > div.bg-soft-primary > div > div > div.space-top-1.col-lg-9 > div.d-flex.justify-content-between > div:nth-child(1) > h1")),
    NOME_COMPLETO(By.cssSelector("#__next > div:nth-child(4) > div.bg-soft-primary > div > div > div.space-top-1.col-lg-9 > div:nth-child(2) > div:nth-child(1) > p")),
    CARREIRAS(By.cssSelector("#__next > div:nth-child(4) > div.space-top-1.space-bottom-2.container > div > div.col-lg-3 > div:nth-child(2) > div > div > label > span")),
    //todo usar findelements em INFORMACOES_DE_CONTATO para acessar email e whatsapp
    INFORMACOES_DE_CONTATO(By.className("list-inline-item mr-1 mb-1 d-block")),
    CAUSAS_SOCIAIS(By.cssSelector("#__next > div:nth-child(4) > div.space-top-1.space-bottom-2.container > div > div.col-lg-3 > div.mb-3.mt-3 > ul > li")),
    COMUNIDADES(By.cssSelector("#__next > div:nth-child(4) > div.space-top-1.space-bottom-2.container > div > div.col-lg-3 > div:nth-child(12) > div > div > label > span")),
    //todo tambem deve ser utilizado findelements
    HABILIDADES(By.className("col-12 col-md-4 col")),
    CONCLUIR(By.className("btn-sm"));
    private By by;
    CurriculumLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
