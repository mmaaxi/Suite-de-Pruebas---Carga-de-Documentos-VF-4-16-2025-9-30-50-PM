package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page documentPage = new tc_005Page();

    @Given("que un usuario está en la página de carga de documento")
    public void usuarioEnPaginaDeCarga() {
        documentPage.navigateToDocumentUploadPage();
    }

    @When("el usuario carga un documento con metadatos incluyendo título, descripción y fecha")
    public void cargarDocumentoConMetadatos() {
        documentPage.uploadDocument("testDocument.pdf");
        documentPage.enterMetadata("Título del Documento", "Descripción del Documento", "2023-10-15");
    }

    @Then("el sistema debería asociar correctamente los metadatos al documento cargado")
    public void verificarMetadatosAsociados() {
        Assert.assertTrue(documentPage.verifyMetadata("Título del Documento", "Descripción del Documento", "2023-10-15"));
    }
}