package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;

public class tc_009Steps {

    private tc_009Page documentUploadPage;

    @Given("the user is on the document upload page")
    public void user_on_document_upload_page() {
        documentUploadPage = new tc_009Page();
        documentUploadPage.navigateToUploadPage();
    }

    @When("the user uploads multiple documents sequentially")
    public void user_uploads_multiple_documents_sequentially() {
        documentUploadPage.uploadDocumentsSequentially();
    }

    @Then("each document should be uploaded successfully with its associated metadata")
    public void documents_should_be_uploaded_successfully() {
        documentUploadPage.verifyDocumentsUploadSuccess();
    }
}