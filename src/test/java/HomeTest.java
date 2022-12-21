import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.sql.Driver;

public class HomeTest {
    private WebDriver driver = null;
    private HomePage homePage = null;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("O usuário acesse a página https:\\/\\/beta.coodesh.com\\/")
    public void o_usuário_acesse_a_página_https_beta_coodesh_com() {
        // Write code here that turns the phrase above into concrete actions
        homePage.navigateToHome();
    }
    @When("A pagina for carregada")
    public void a_pagina_for_carregada() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Deve ser apresentado o botão Ver vagas")
    public void deve_ser_apresentado_o_botão_ver_vagas() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Deve ser apresentado o botão Para Empresas")
    public void deve_ser_apresentado_o_botão_para_empresas() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Deve ser apresentado o botão Blog")
    public void deve_ser_apresentado_o_botão_blog() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Deve ser apresentado o botão Login")
    public void deve_ser_apresentado_o_botão_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Deve ser apresentado o botão Criar conta")
    public void deve_ser_apresentado_o_botão_criar_conta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
