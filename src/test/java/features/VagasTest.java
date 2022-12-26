package features;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.VagasPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VagasTest {
    private VagasPage vagasPage;
    private WebDriver driver;
    @Before("@Vagas")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        vagasPage = new VagasPage(driver);
    }
    @Given("O usuário acesse a página {string}")
    public void o_usuário_acesse_a_página(String string) {
        // Write code here that turns the phrase above into concrete actions
        vagasPage = new VagasPage(driver);
        vagasPage.navigateToVagas();
        vagasPage.clickCookiesOk();
    }
    @When("Ele buscar por {string}")
    public void ele_buscar_por(String busca) {
        // Write code here that turns the phrase above into concrete actions
        vagasPage.setConteudoDaBusca(busca);
        vagasPage.buscarClick();
    }
    @Then("Deverá ser apresentado as vagas abaixo")
    public void deverá_ser_apresentado_as_vagas_abaixo(List<String> vagas) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();
        for (String vaga: vagas) {
            switch (vaga.toLowerCase()){
                case "frontend vue.js sr":
                    assertThat(vagasPage.getFrontend().toLowerCase()).isEqualTo(vaga.toLowerCase());
                    break;
                case "fullstack developer":
                    assertThat(vagasPage.getFullstack().toLowerCase()).isEqualTo(vaga.toLowerCase());
                    break;
                case "devops":
                    assertThat(vagasPage.getDevops().toLowerCase()).isEqualTo(vaga.toLowerCase());
                    break;

            }
        }
    }
}
