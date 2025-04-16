package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    private WebDriver driver;
    private By uploadButton = By.id("fileUpload");
    private By errorMessage = By.id("errorSizeExceeded");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    public void uploadLargeFile() {
        driver.findElement(uploadButton).sendKeys("/path/to/largefile.txt");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}