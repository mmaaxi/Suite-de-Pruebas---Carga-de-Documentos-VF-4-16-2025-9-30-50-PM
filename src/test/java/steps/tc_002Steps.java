package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver = new ChromeDriver();
    tc_002Page uploadPage = new tc_002Page(driver);

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        driver.get("http://example.com/upload");
    }

    @When("the user attempts to upload a \".exe\" or \".txt\" file")
    public void the_user_attempts_to_upload_invalid_file_formats() {
        uploadPage.uploadFile("path/to/invalidFile.exe");
    }

    @Then("the system should display an error message indicating the format is not allowed")
    public void the_system_should_display_an_error_message() {
        String errorMessage = uploadPage.getErrorMessage();
        Assert.assertEquals("File format not allowed", errorMessage);
        driver.quit();
    }
}