package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    private tc_004Page documentPage = new tc_004Page();

    @Given("I am on the document upload page")
    public void iAmOnTheDocumentUploadPage() {
        documentPage.navigateToUploadPage();
    }

    @When("I upload a valid PDF document")
    public void iUploadAValidPDFDocument() {
        documentPage.uploadPdfDocument("path/to/valid/document.pdf");
    }

    @Then("the document should be stored successfully")
    public void theDocumentShouldBeStoredSuccessfully() {
        Assert.assertTrue(documentPage.isDocumentStored());
    }

    @And("the content of the document should be accessible without corruption")
    public void theContentOfTheDocumentShouldBeAccessibleWithoutCorruption() {
        Assert.assertTrue(documentPage.isDocumentContentAccessibleAndValid());
    }
}