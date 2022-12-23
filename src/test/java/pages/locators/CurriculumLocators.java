package pages.locators;

import org.openqa.selenium.By;

public class CurriculumLocators {
    public static By EMAIL = By.cssSelector("#__next > div:nth-child(4) > div.bg-soft-primary > div > div > div.space-top-1.col-lg-9 > div.d-flex.justify-content-between > div:nth-child(1) > h1");
    public static By NOME_COMPLETO = By.cssSelector("#__next > div:nth-child(4) > div.bg-soft-primary > div > div > div.space-top-1.col-lg-9 > div:nth-child(2) > div:nth-child(1) > p");
    public static By CARREIRAS = By.cssSelector("#__next > div:nth-child(4) > div.space-top-1.space-bottom-2.container > div > div.col-lg-3 > div:nth-child(2) > div > div > label > span");
    //todo usar findelements em INFORMACOES_DE_CONTATO para acessar email e whatsapp
    public static By INFORMACOES_DE_CONTATO = By.className("list-inline-item mr-1 mb-1 d-block");
    public static By CAUSAS_SOCIAIS = By.cssSelector("#__next > div:nth-child(4) > div.space-top-1.space-bottom-2.container > div > div.col-lg-3 > div.mb-3.mt-3 > ul > li");
    public static By COMUNIDADES = By.cssSelector("#__next > div:nth-child(4) > div.space-top-1.space-bottom-2.container > div > div.col-lg-3 > div:nth-child(12) > div > div > label > span");
    //todo tambem deve ser utilizado findelements
    public static By HABILIDADES = By.className("col-12 col-md-4 col");
    public static By CONCLUIR = By.className("btn-sm");
}
