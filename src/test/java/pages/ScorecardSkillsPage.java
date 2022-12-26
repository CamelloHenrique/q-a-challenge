package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.locators.ScorecardSkillLocators;
import utils.SeleniumUtils;

import java.util.Locale;

public class ScorecardSkillsPage {
    private WebDriver driver;
    public ScorecardSkillsPage(WebDriver driver) {
        this.driver = driver;
    }
    //Esse método serve para mover o slide que representa o nével que o usuário tem de determinada habilidade.
    //A váriavel times, serve para definir quantas vezes o slide será movido.
    //O comando driver.findElement(locator).click(); irá colocar o slide em nível "básico", com isso, caso o nível da
    //Habilidade seja este, a função não irá fazer nada.
    private void slideBar(By locator,String level) {
        level = level.toLowerCase();
        Integer times = 0;
        switch (level){
            case "básico":
                break;
            case "praticante":
                times = 1;
                break;
            case "avançado":
                times = 2;
                break;
        }
        if(level!="nenhum") {
            driver.findElement(locator).click();
            Actions keyDown = new Actions(driver);
            for (int i = 0; i < times; i++) {
                keyDown.sendKeys(Keys.RIGHT).perform();
            }
        }
    }
    //O scorecard utiliza um slider para o usário definir o seu grau de conhecimento em cada habilidade.
    //As funções abaixo servem para mover esse slider.
    //O parâmetro "level" indica quantas vezes o slider será movido para a direita.
    //Quanto mais a direita, maior o grau de perícia do usuário na habilidade.
    //O slider posibilita mover até 3 vezes para a direita, caso o valor de "level" seja maior ou igual a 3,
    //o comportamento esperado é que o método mova o silider até o final.
    public void slideMetodologiasAgeis(String level){
        SeleniumUtils.esperarAteCampoVisivel(driver,ScorecardSkillLocators.METODOLOGIAS_AGEIS);
        slideBar(ScorecardSkillLocators.METODOLOGIAS_AGEIS,level);
    }
    public void slideModelagemDeDados(String level){
        slideBar(ScorecardSkillLocators.MODELAGEM_DE_DADOS,level);
    }
    public void slideEstruturasDeDados(String level){
        slideBar(ScorecardSkillLocators.ESTRUTURA_DE_DADOS,level);
    }
    public void slideUml(String level){
        SeleniumUtils.esperarAteCampoVisivel(driver,ScorecardSkillLocators.UML);
        slideBar(ScorecardSkillLocators.UML,level);
    }
    public void slideGit(String level){
        slideBar(ScorecardSkillLocators.GIT,level);
    }
    public void slideComunicacaoTecnica(String level){
        slideBar(ScorecardSkillLocators.COMUNICACAO_TECNICA,level);
    }
    public void slideGestaoDeTempo(String level){
        slideBar(ScorecardSkillLocators.GESTAO_DE_TEMPO,level);
    }
    public void slideLogica(String level){
        slideBar(ScorecardSkillLocators.LOGICA,level);
    }
    public void slideTestesExploratorios(String level){
        slideBar(ScorecardSkillLocators.TESTES_EXPLORATORIOS,level);
    }
    public void slideCasoDeUso(String level){
        slideBar(ScorecardSkillLocators.CASO_DE_USO,level);
    }
    public void slideBehaviourDrivenDevelopment(String level){
        slideBar(ScorecardSkillLocators.BEHAVIOUR_DRIVEN_DEVELOPMENT,level);
    }
    public void slideTestDrivenDevelopment(String level){
        slideBar(ScorecardSkillLocators.TEST_DRIVEN_DEVELOPMENT,level);
    }
    public void slideUnitTest(String level){
        slideBar(ScorecardSkillLocators.UNIT_TESTS,level);
    }
    public void slideTestCoverage(String level){
        slideBar(ScorecardSkillLocators.TEST_COVEREGE,level);
    }
    public void slideAutomacaoDeTestes(String level){
        slideBar(ScorecardSkillLocators.AUTOMACAO_DE_TESTES,level);
    }
    public void slidePlanejamentoDeTestes(String level){
        slideBar(ScorecardSkillLocators.PLANEJAMENTO_DE_TESTES,level);
    }

    public void slideAnaliseDeRequisitos(String level){
        slideBar(ScorecardSkillLocators.ANALISE_DE_REQUISITOS,level);
    }
    public void slideCucumber(String level){
        slideBar(ScorecardSkillLocators.CUCUMBER,level);
    }
    public void proximoClick(){
        driver.findElement(ScorecardSkillLocators.PROXIMO_ENVIAR).click();
    }
    public CurriculumPage enviarClick(){
        driver.findElement(ScorecardSkillLocators.PROXIMO_ENVIAR).click();
        return new CurriculumPage(driver);
    }


}
