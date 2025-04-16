package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page = new tc_001Page(driver);
        page.navigateToUploadPage();
    }

    @When("El usuario selecciona el archivo PDF desde el botón 'Seleccionar Archivo'")
    public void el_usuario_selecciona_el_archivo_PDF_desde_el_boton_seleccionar_archivo() {
        page.selectPdfFile("ruta/del/archivo.pdf");
    }

    @Then("El sistema muestra una vista previa del archivo seleccionado")
    public void el_sistema_muestra_una_vista_previa_del_archivo_seleccionado() {
        Assert.assertTrue(page.isPreviewDisplayed());
    }

    @When("El usuario hace clic en 'Cargar documento'")
    public void el_usuario_hace_clic_en_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("El documento se carga correctamente y se muestra un mensaje de éxito")
    public void el_documento_se_carga_correctamente_y_se_muestra_un_mensaje_de_exito() {
        Assert.assertTrue(page.isUploadSuccessMessageDisplayed());
    }
}