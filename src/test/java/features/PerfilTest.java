package features;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import randomUser.RandomUser;
import utils.SeleniumUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class PerfilTest {
    private WebDriver driver;
    private RandomUser randomUser;
    private ProfilePage profilePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private CadastresePage cadastresePage;
    private PersonalPage personalPage;
    private ScorecardIntroPage scorecardIntroPage;
    private ScorecardSkillsPage scorecardSkillsPage;
    private CurriculumPage curriculumPage;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }
    @Given("O usuário acessa a página do coodesh")
    public void o_usuário_acessa_a_página_do_coodesh() {
        homePage.navigateToHome();//abre a página https://beta.coodesh.com/
        homePage.clickCookiesOk();
    }
    @Given("Clique no botão Login")
    public void clique_no_botão_login() {
        // Write code here that turns the phrase above into concrete actions
        loginPage = homePage.loginClick();
    }
    @Given("Clique no botão Cadastre-se")
    public void clique_no_botão_cadastre_se() {
        // Write code here that turns the phrase above into concrete actions
        cadastresePage = loginPage.cadastreSeClick();
    }
    @When("O usuário preencher os campos abaixo")
    public void o_usuário_preencher_os_campos_abaixo(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        randomUser = new RandomUser();
        cadastresePage.insertNomeCompleto(randomUser.getFullName());
        cadastresePage.insertEmail(randomUser.getEmail());
        cadastresePage.insertSenha(randomUser.getPassword());

    }
    @When("Aceitar os termos e condições")
    public void aceitar_os_termos_e_condições() {
        // Write code here that turns the phrase above into concrete actions
        cadastresePage.liEAceitoOk();
    }
    @When("Clicar em inscreva-se")
    public void clicar_em_inscreva_se() {
        profilePage = cadastresePage.inscrevaSeClick();
    }

    @When("ele informar que a carreira desejada é a de QA\\/Testes")
    public void ele_informar_que_a_carreira_desejada_é_a_de_qa_testes() {
        // Write code here that turns the phrase above into concrete actions
        profilePage.selectQaTestes();
    }

    @When("Possue a habilidade {string}")
    public void possue_a_habilidade(String habilidade) {
        profilePage.cucumberClick();
    }

    @When("Seu whatsapp é {string}")
    public void seu_whatsapp_é(String whatsapp) {
        profilePage.insertWhatsapp(whatsapp);
    }

    @When("Reside na cidade de {string}")
    public void reside_na_cidade_de(String cidade) {
        profilePage.insertCidade(cidade);
    }

    @When("Tem preferencia por trabalho {string}")
    public void temPreferenciaPorTrabalho(String preferencia) {
        profilePage.selectHibrida();
    }

    @When("clicar em Próximo")
    public void clicar_em_próximo() {
        personalPage = profilePage.proximoClick();
    }

    @When("Informar interese em {string}")
    public void informarIntereseEm(String interesse) {
        personalPage.selectCausaSocial(interesse);



    }

    @And("Sua Raça")
    public void sua_raça() {
        personalPage.insertRaca();

    }

    @And("Sua identidade de gênero")
    public void sua_identidade_de_gênero() {
        personalPage.insertGenero();
    }

    @And("Sua orientação sexual")
    public void sua_orientação_sexual() {
        personalPage.insertOrientacaoSexual();
    }

    @And("Clicar em Próximo")
    public void clicarEmPróximo() {
        scorecardIntroPage = personalPage.proximoClick();
    }

    @And("Clicar em Responder Agora")
    public void clicar_em_responder_agora() {
        scorecardSkillsPage = scorecardIntroPage.responderAgoraClick();
//        scorecardSkillsPage.slideCasoDeUso("avançado");
//        scorecardSkillsPage.proximoClick();
//        scorecardSkillsPage.slideBehaviourDrivenDevelopment("avançado");
//        scorecardSkillsPage.slideTestDrivenDevelopment("avançado");
//        scorecardSkillsPage.slideUnitTest("avançado");
//        scorecardSkillsPage.slideTestCoverage("avançado");
//        scorecardSkillsPage.slideAutomacaoDeTestes("avançado");
//        scorecardSkillsPage.slideAutomacaoDeTestes("avançado");
//        scorecardSkillsPage.slidePlanejamentoDeTestes("avançado");
//        scorecardSkillsPage.slideAnaliseDeRequisitos("avançado");
//        scorecardSkillsPage.slideCucumber("avançado");
//        curriculumPage = scorecardSkillsPage.enviarClick();
    }

    @When("informar seu grau de conhecimento em cada habilidade como na tabela abaixo e em seguida clicar em próximo")
    public void informar_seu_grau_de_conhecimento_em_cada_habilidade_como_na_tabela_abaixo_e_em_seguida_clicar_em_próximo(List<Map<String,String>> skillList) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        for (Map<String, String> columns : skillList ) {
            String habilidade = columns.get("Habilidade");
            String nivel = columns.get("Nível");
            switch (habilidade.toLowerCase()){
                case "metodologias ágeis / scrum":
                    scorecardSkillsPage.slideMetodologiasAgeis(nivel);
                    break;
                case "análise e modelagem de dados":
                    scorecardSkillsPage.slideModelagemDeDados(nivel);
                    break;
                case "estrutura de dados":
                    scorecardSkillsPage.slideEstruturasDeDados(nivel);
                    SeleniumUtils.scrollPage(driver,500);
                    break;
                case "uml":
                    scorecardSkillsPage.slideUml(nivel);
                    break;
                case "git":
                    scorecardSkillsPage.slideGit(nivel);
                    break;
                case "comunicação técnica":
                    scorecardSkillsPage.slideComunicacaoTecnica(nivel);
                    break;
                case "gestão de tempo":
                    scorecardSkillsPage.slideGestaoDeTempo(nivel);
                    break;
                case "lógica":
                    scorecardSkillsPage.slideLogica(nivel);
                    break;
                case "testes exploratórios":
                    scorecardSkillsPage.slideTestesExploratorios(nivel);
                    break;
                case "caso de uso":
                    scorecardSkillsPage.slideCasoDeUso(nivel);
                    break;

            }
        }
        scorecardSkillsPage.proximoClick();

    }

    @When("informar seu grau de conhecimento em cada habilidade como na tabela abaixo e em seguida clicar em Enviar")
    public void informar_seu_grau_de_conhecimento_em_cada_habilidade_como_na_tabela_abaixo_e_em_seguida_clicar_em_enviar(List<Map<String,String>> skillList) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        for (Map<String, String> columns : skillList ) {
            String habilidade = columns.get("Habilidade");
            String nivel = columns.get("Nível");
            switch (habilidade.toLowerCase()){
                case "behaviour driven development":
                    scorecardSkillsPage.slideBehaviourDrivenDevelopment(nivel);
                    break;
                case "test driven development":
                    scorecardSkillsPage.slideTestDrivenDevelopment(nivel);
                    break;
                case "unit tests":
                    scorecardSkillsPage.slideUnitTest(nivel);
                    SeleniumUtils.scrollPage(driver,500);
                    break;
                case "test coverage":
                    scorecardSkillsPage.slideTestCoverage(nivel);
                    break;
                case "automação de testes":
                    scorecardSkillsPage.slideAutomacaoDeTestes(nivel);
                    break;
                case "planejamento de testes":
                    scorecardSkillsPage.slidePlanejamentoDeTestes(nivel);
                    break;
                case "análise de requisitos":
                    scorecardSkillsPage.slideAnaliseDeRequisitos(nivel);
                    break;
                case "cucumber":
                    scorecardSkillsPage.slideCucumber(nivel);
                    break;
            }
        }
        scorecardSkillsPage.enviarClick();
    }
}
