package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_007Page;
import org.junit.Assert;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("la aplicación está configurada para simular una conexión de red lenta")
    public void configureSlowNetwork() {
        page.simulateSlowNetwork();
    }
    
    @When("el usuario carga un archivo PDF")
    public void theUserUploadsAPDFFile() {
        page.uploadPDF();
    }
    
    @Then("el sistema debe mostrar un indicador de carga prolongada")
    public void theSystemShouldDisplayALongLoadingIndicator() {
        Assert.assertTrue(page.isLoadingIndicatorVisible());
    }
    
    @Then("el sistema debe completar la carga del archivo sin errores")
    public void theSystemShouldSuccessfullyCompleteTheUpload() {
        Assert.assertTrue(page.isUploadSuccessful());
    }
}