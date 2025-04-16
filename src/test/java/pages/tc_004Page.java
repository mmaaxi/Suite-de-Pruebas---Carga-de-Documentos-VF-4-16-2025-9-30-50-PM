package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    private WebDriver driver;
    private By uploadButton = By.id("upload-button");
    private By confirmationMessage = By.id("confirmation-message");
    private By documentContent = By.id("document-content");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadPdfDocument(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
    }

    public boolean isDocumentStored() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public boolean isDocumentContentAccessibleAndValid() {
        String content = driver.findElement(documentContent).getText();
        // Perform validation checks on the document content if necessary
        return content != null && !content.isEmpty();
    }
}