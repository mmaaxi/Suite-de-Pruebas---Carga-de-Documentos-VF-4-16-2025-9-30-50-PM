package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;
import utils.DriverFactory;

public class tc_003Steps {
    WebDriver driver = DriverFactory.getDriver();
    tc_003Page fileUploadPage = new tc_003Page(driver);

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        fileUploadPage.navigateToUploadPage();
    }

    @When("I select a file that exceeds the maximum allowed size")
    public void i_select_a_file_that_exceeds_the_maximum_allowed_size() {
        fileUploadPage.uploadLargeFile();
    }

    @Then("I should see an error message indicating the size exceeded")
    public void i_should_see_an_error_message_indicating_the_size_exceeded() {
        Assert.assertTrue("Error message about size exceeded should be displayed", 
                          fileUploadPage.isErrorMessageDisplayed());
    }
}