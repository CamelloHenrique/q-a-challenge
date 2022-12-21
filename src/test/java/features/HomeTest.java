package features;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.sql.Driver;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeTest {
    private WebDriver driver = null;
    private HomePage homePage = null;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("O usuário acessa a página https:\\/\\/beta.coodesh.com\\/")
    public void o_usuário_acessa_a_página_https_beta_coodesh_com() {
        homePage.navigateToHome();//abre a página https://beta.coodesh.com/

    }
    @When("A pagina for carregada")
    public void a_pagina_for_carregada() {
        //após o carregamento da página será perguntado se o usuário aceita que o site armazene cookeis
        //o método abaixo aceita o armazendamento dos cookies.
        //esse item visível, indica que a página foi carregada, uma vez que a pergunta é feita após a página ser carregada
        //além disso, internamente ao metódo navigateToHome, existe a chamada para o método get, do selenium, que espera o
        //carregamento da página.
        homePage.clickCookiesOk();//ao abrir a página é necessário aceitar os cookies, esse metódo faz isso.
    }
    @Then("A página carregada deve ter o título {string}")
    public void a_página_carregada_deve_ter_o_título(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.getTitle()).isEqualTo(string);
    }
    @Then("Deve ser apresentado o botão Ver vagas")
    public void deve_ser_apresentado_o_botão_ver_vagas() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.isVerVagasVisible()).isTrue();
    }

    @Then("Deve ser apresentado o botão Para Empresas")
    public void deve_ser_apresentado_o_botão_para_empresas() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.isParaEmpresasVisible()).isTrue();
    }

    @Then("Deve ser apresentado o botão Blog")
    public void deve_ser_apresentado_o_botão_blog() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.isBlogVisible()).isTrue();
    }

    @Then("Deve ser apresentado o botão Login")
    public void deve_ser_apresentado_o_botão_login() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.isLoginVisible()).isTrue();
    }

    @Then("Deve ser apresentado o botão Criar conta")
    public void deve_ser_apresentado_o_botão_criar_conta() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(homePage.isCriarContaVisible()).isTrue();
    }

}
