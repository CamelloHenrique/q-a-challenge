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
    private void slideBar(By locator,Integer times) {
        for (int i = 0; i< times; i++){
            driver.findElement(locator).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    //O scorecard utiliza um slider para o usário definir o seu grau de conhecimento em cada habilidade.
    //As funções abaixo servem para mover esse slider.
    //O parâmetro "times" indica quantas vezes o slider será movido para a direita.
    //Quanto mais a direita, maior o grau de perícia do usuário na habilidade.
    //O slider posibilita mover até 3 vezes para a direita, caso o valor de "times" seja maior ou igual a 3,
    //o comportamento esperado é que o método mova o silider até o final.
    public void slideMetodologiasAgeis(Integer times){
        slideBar(ScorecardSkillLocators.METODOLOGIAS_AGEIS,times);
    }
    public void slideModelagemDeDados(Integer times){
        slideBar(ScorecardSkillLocators.MODELAGEM_DE_DADOS,times);
    }
    public void slideEstruturasDeDados(Integer times){
        slideBar(ScorecardSkillLocators.ESTRUTURA_DE_DADOS,times);
    }
    public void slideUml(Integer times){
        slideBar(ScorecardSkillLocators.UML,times);
    }
    public void slideGit(Integer times){
        slideBar(ScorecardSkillLocators.GIT,times);
    }
    public void slideComunicacaoTecnica(Integer times){
        slideBar(ScorecardSkillLocators.COMUNICACAO_TECNICA,times);
    }
    public void slideGestaoDeTempo(Integer times){
        slideBar(ScorecardSkillLocators.GESTAO_DE_TEMPO,times);
    }
    public void slideLogica(Integer times){
        slideBar(ScorecardSkillLocators.LOGICA,times);
    }
    public void slideTestesExploratorios(Integer times){
        slideBar(ScorecardSkillLocators.TESTES_EXPLORATORIOS,times);
    }
    public void slideCasoDeUso(Integer times){
        slideBar(ScorecardSkillLocators.CASO_DE_USO,times);
    }
    public void slideBehaviourDrivenDevelopment(Integer times){
        slideBar(ScorecardSkillLocators.BEHAVIOUR_DRIVEN_DEVELOPMENT,times);
    }
    public void slideTestDrivenDevelopment(Integer times){
        slideBar(ScorecardSkillLocators.TEST_DRIVEN_DEVELOPMENT,times);
    }
    public void slideAutomacaoDeTestes(Integer times){
        slideBar(ScorecardSkillLocators.AUTOMACAO_DE_TESTES,times);
    }
    public void slidePlanejamentoDeTestes(Integer times){
        slideBar(ScorecardSkillLocators.PLANEJAMENTO_DE_TESTES,times);
    }

    public void slideAnaliseDeRequisitos(Integer times){
        slideBar(ScorecardSkillLocators.ANALISE_DE_REQUISITOS,times);
    }
    public void slideBdd(Integer times){
        slideBar(ScorecardSkillLocators.BDD,times);
    }
    public void slideCucumber(Integer times){
        slideBar(ScorecardSkillLocators.CUCUMBER,times);
    }
    public void proximoClick(){
        driver.findElement(ScorecardSkillLocators.PROXIMO_ENVIAR).click();
    }
    public CurriculumPage enviarClick(){
        driver.findElement(ScorecardSkillLocators.PROXIMO_ENVIAR).click();
        return new CurriculumPage(driver);
    }


}
