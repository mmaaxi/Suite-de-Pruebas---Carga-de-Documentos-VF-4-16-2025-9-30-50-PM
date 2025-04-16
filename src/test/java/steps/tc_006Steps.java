package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {
    WebDriver driver = new ChromeDriver();
    tc_006Page uploadPage = new tc_006Page(driver);

    @Given("^El usuario está en la página de carga de archivos$")
    public void navigateToFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    @When("^El usuario intenta cargar un documento con contenido malicioso$")
    public void uploadMaliciousFile() {
        uploadPage.uploadFile("path/to/malicious/file");
    }

    @Then("^El sistema rechaza el archivo y muestra una alerta de seguridad$")
    public void verifySecurityAlert() {
        assertTrue(uploadPage.isSecurityAlertDisplayed());
        driver.quit();
    }
}