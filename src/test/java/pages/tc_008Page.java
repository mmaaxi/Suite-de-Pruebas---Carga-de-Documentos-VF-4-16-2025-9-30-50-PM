package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_008Page {
    WebDriver driver;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "cancelButton")
    WebElement cancelButton;

    @FindBy(id = "uploadStatus")
    WebElement uploadStatus;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void initiateUpload() {
        uploadButton.click();
    }

    public void clickCancel() {
        cancelButton.click();
    }

    public boolean isUploadInProgress() {
        return uploadStatus.getText().contains("uploading");
    }

    public boolean isAtInitialState() {
        return !isUploadInProgress() && uploadStatus.getText().contains("ready");
    }
}