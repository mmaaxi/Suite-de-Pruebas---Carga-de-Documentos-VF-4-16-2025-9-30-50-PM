package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {
    WebDriver driver;

    By uploadInput = By.id("documentUpload");
    By titleInput = By.id("documentTitle");
    By descriptionInput = By.id("documentDescription");
    By dateInput = By.id("documentDate");
    By submitButton = By.id("submitMetadata");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadDocument(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    public void enterMetadata(String title, String description, String date) {
        driver.findElement(titleInput).sendKeys(title);
        driver.findElement(descriptionInput).sendKeys(description);
        driver.findElement(dateInput).sendKeys(date);
        driver.findElement(submitButton).click();
    }

    public boolean verifyMetadata(String title, String description, String date) {
        // Add verification logic based on application feedback
        return true; // Placeholder return
    }
}