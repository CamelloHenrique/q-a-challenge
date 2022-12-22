package pages.locators;

import org.openqa.selenium.By;

public enum ScorecardSkillLocators {
    METODOLOGIAS_AGEIS(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(2) > td")),
    MODELAGEM_DE_DADOS(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(2) > td")),
    ESTRUTURA_DE_DADOS(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(4) > td")),
    UML(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(4) > td > div")),
    GIT(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(9) > td")),
    COMUNICACAO_TECNICA(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(10) > td")),
    GESTAO_DE_TEMPO(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(7) > td")),
    LOGICA(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(8) > td")),
    TESTES_EXPLORATORIOS(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(9) > td")),
    CASO_DE_USO(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(10) > td")),
    BEHAVIOUR_DRIVEN_DEVELOPMENT(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(1) > td")),
    TEST_DRIVEN_DEVELOPMENT(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(1) > td")),
    AUTOMACAO_DE_TESTES(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(5) > td")),
    PLANEJAMENTO_DE_TESTES(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(6) > td")),
    ANALISE_DE_REQUISITOS(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(7) > td")),
    BDD(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(8) > td")),
    CUCUMBER(By.cssSelector("#__next > div:nth-child(4) > div > div > form > table > tbody > tr:nth-child(9) > td")),
    PROXIMO_ENVIAR(By.className("btn-primary")),;
    private By by;
    ScorecardSkillLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
