package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.locators.ScorecardSkillLocators;

import java.util.logging.SocketHandler;

public class ScorecardSkillsPage {
    private WebDriver driver;
    private By metodologiasAgeis = ScorecardSkillLocators.METODOLOGIAS_AGEIS.getBy();
    private By modelagemDeDados = ScorecardSkillLocators.MODELAGEM_DE_DADOS.getBy();
    private By estruturasDeDados = ScorecardSkillLocators.ESTRUTURA_DE_DADOS.getBy();
    private By uml = ScorecardSkillLocators.UML.getBy();
    private By git = ScorecardSkillLocators.GIT.getBy();
    private By comunicacaoTecnica = ScorecardSkillLocators.COMUNICACAO_TECNICA.getBy();
    private By gestaoDeTempo = ScorecardSkillLocators.GESTAO_DE_TEMPO.getBy();
    private By logica = ScorecardSkillLocators.LOGICA.getBy();
    private By testesExploratorios = ScorecardSkillLocators.TESTES_EXPLORATORIOS.getBy();
    private By casoDeUso = ScorecardSkillLocators.CASO_DE_USO.getBy();
    private By behaviourDrivenDevelopment = ScorecardSkillLocators.BEHAVIOUR_DRIVEN_DEVELOPMENT.getBy();
    private By testDrivenDevelopment = ScorecardSkillLocators.TEST_DRIVEN_DEVELOPMENT.getBy();
    private By automacaoDeTestes = ScorecardSkillLocators.AUTOMACAO_DE_TESTES.getBy();
    private By planejamentoDeTestes = ScorecardSkillLocators.PLANEJAMENTO_DE_TESTES.getBy();
    private By analiseDeRequisitos = ScorecardSkillLocators.ANALISE_DE_REQUISITOS.getBy();
    private By bdd = ScorecardSkillLocators.BDD.getBy();
    private By cucumber = ScorecardSkillLocators.CUCUMBER.getBy();
    private By proximoEnviar = ScorecardSkillLocators.PROXIMO_ENVIAR.getBy();

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
            driver.findElement(metodologiasAgeis).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideModelagemDeDados(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(modelagemDeDados).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideEstruturasDeDados(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(estruturasDeDados).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideUml(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(uml).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideGit(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(git).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideComunicacaoTecnica(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(comunicacaoTecnica).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideGestaoDeTempo(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(gestaoDeTempo).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideLogica(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(logica).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideTestesExploratorios(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(testesExploratorios).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideCasoDeUso(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(casoDeUso).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideBehaviourDrivenDevelopment(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(behaviourDrivenDevelopment).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideTestDrivenDevelopment(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(testDrivenDevelopment).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideAutomacaoDeTestes(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(automacaoDeTestes).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slidePlanejamentoDeTestes(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(planejamentoDeTestes).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void slideAnaliseDeRequisitos(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(analiseDeRequisitos).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideBdd(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(bdd).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slideCucumber(Integer times){
        for (int i = 0; i<times; i++){
            driver.findElement(cucumber).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void proximoClick(){
        driver.findElement(proximoEnviar).click();
    }
    //todo falta criar os métodos da classe DashboardPage
    public DashboardPage enviarClick(){
        driver.findElement(proximoEnviar).click();
        return new DashboardPage(driver);
    }


}
