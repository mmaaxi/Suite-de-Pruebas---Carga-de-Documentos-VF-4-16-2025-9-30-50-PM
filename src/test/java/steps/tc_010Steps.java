package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page logPage = new tc_010Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        logPage.navigateToUploadPage();
    }

    @When("el usuario carga un documento")
    public void el_usuario_carga_un_documento() {
        logPage.uploadDocument();
    }

    @Then("el sistema registra la hora, usuario y estado de la carga en la bitácora")
    public void el_sistema_registra_la_hora_usuario_y_estado_de_la_carga_en_la_bitácora() {
        Assert.assertTrue(logPage.isLogEntryCorrect());
    }
}