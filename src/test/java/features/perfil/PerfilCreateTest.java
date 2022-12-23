package features.perfil;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastresePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import randomUser.RandomUser;

import static org.assertj.core.api.Assertions.assertThat;

public class PerfilCreateTest {
    private WebDriver driver;
    private ProfilePage profilePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private CadastresePage cadastresePage;

    @Before("@CriaçãoDeConta")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        profilePage = new ProfilePage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        cadastresePage = new CadastresePage(driver);
    }
    @Given("O usuário acessa a página do coodesh")
    public void o_usuário_acessa_a_página_do_coodesh() {
        homePage.navigateToHome();//abre a página https://beta.coodesh.com/
        homePage.clickCookiesOk();
    }
    @Given("Clique no botão Login")
    public void clique_no_botão_login() {
        // Write code here that turns the phrase above into concrete actions
        homePage.loginClick();
    }
    @Given("Clique no botão Cadastre-se")
    public void clique_no_botão_cadastre_se() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.cadastreSeClick();
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
        RandomUser randomUser = new RandomUser();
        cadastresePage.insertNomeCompleto(randomUser.getFullName());
        cadastresePage.insertEmail(randomUser.getEmail());
        cadastresePage.insertSenha(randomUser.getPassword());

    }
    @When("Aceitar os termos e condições")
    public void aceitar_os_termos_e_condições() {
        // Write code here that turns the phrase above into concrete actions
        cadastresePage.liEAceitoOk();
    }
    @And("Clicar em inscreva-se")
    public void clicar_em_inscreva_se() {
        cadastresePage.inscrevaSeClick();
    }
    @Then("O usuário deverá ser redirecionado para a página {string}")
    public void o_usuário_deverá_ser_redirecionado_para_a_página(String expected) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(profilePage.getCurrentPageUrl()).isEqualTo(expected);

    }
    @Then("A página deve conter os campos abaixo")
    public void a_página_deve_conter_os_campos_abaixo(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        assertThat(profilePage.isNomeCompletoVisible()).isTrue();
        assertThat(profilePage.isQaTestesVisible()).isTrue();
        assertThat(profilePage.isSuasHabilidadesVisible()).isTrue();
        //todo assertThat(profilePage.isExperienciaGeralVisible()).isTrue();
        assertThat(profilePage.isMomentoProfissionalVisible()).isTrue();
        assertThat(profilePage.isWhatsappVisible()).isTrue();
        assertThat(profilePage.isCidadeVisible()).isTrue();
        assertThat(profilePage.isRemotaVisible()).isTrue();
        assertThat(profilePage.isPresencialpVisible()).isTrue();
        assertThat(profilePage.isHibridaVisible()).isTrue();


    }


}
