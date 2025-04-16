package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;
import static org.junit.Assert.*;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    public tc_008Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_008Page.class);
    }

    @Given("the user initiates a document upload")
    public void initiateDocumentUpload() {
        page.initiateUpload();
    }

    @When("the user clicks on 'Cancel'")
    public void clickCancel() {
        page.clickCancel();
    }

    @Then("the upload is stopped")
    public void verifyUploadStopped() {
        assertFalse(page.isUploadInProgress());
    }

    @And("the system returns to the initial state without storing the file")
    public void verifySystemReturnsToInitialState() {
        assertTrue(page.isAtInitialState());
    }
}