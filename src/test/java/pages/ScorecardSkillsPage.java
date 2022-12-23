package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.locators.ScorecardSkillLocators;

public class ScorecardSkillsPage {
    private WebDriver driver;
    public ScorecardSkillsPage(WebDriver driver) {
        this.driver = driver;
    }
    //O scorecard utiliza um slider para o usário definir o seu grau de conhecimento em cada habilidade.
    //As funções abaixo servem para mover esse slider.
    //O parâmetro "times" indica quantas vezes o slider será movido para a direita.
    //Quanto mais a direita, maior o grau de perícia do usuário na habilidade.
    //O slider posibilita mover até 3 vezes para a direita, caso o valor de "times" seja maior ou igual a 3,
    //o comportamento esperado é que o método mova o silider até o final.
    public void slideMetodologiasAgeis(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.METODOLOGIAS_AGEIS).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideModelagemDeDados(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.MODELAGEM_DE_DADOS).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideEstruturasDeDados(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.ESTRUTURA_DE_DADOS).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideUml(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.UML).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideGit(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.GIT).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideComunicacaoTecnica(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.COMUNICACAO_TECNICA).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideGestaoDeTempo(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.GESTAO_DE_TEMPO).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideLogica(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.LOGICA).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideTestesExploratorios(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.TESTES_EXPLORATORIOS).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideCasoDeUso(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.CASO_DE_USO).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideBehaviourDrivenDevelopment(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.BEHAVIOUR_DRIVEN_DEVELOPMENT).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideTestDrivenDevelopment(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.TEST_DRIVEN_DEVELOPMENT).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideAutomacaoDeTestes(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.AUTOMACAO_DE_TESTES).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slidePlanejamentoDeTestes(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.PLANEJAMENTO_DE_TESTES).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void slideAnaliseDeRequisitos(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.ANALISE_DE_REQUISITOS).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideBdd(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.BDD).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideCucumber(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(ScorecardSkillLocators.CUCUMBER).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void proximoClick(){
        driver.findElement(ScorecardSkillLocators.PROXIMO_ENVIAR).click();
    }
    public CurriculumPage enviarClick(){
        driver.findElement(ScorecardSkillLocators.PROXIMO_ENVIAR).click();
        return new CurriculumPage(driver);
    }


}
