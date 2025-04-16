package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_009Page {

    private WebDriver driver;
    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");

    public tc_009Page() {
        this.driver = new ChromeDriver();
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadDocumentsSequentially() {
        String[] documents = {"document1.pdf", "document2.pdf", "document3.pdf"};
        for (String doc : documents) {
            WebElement uploadElem = driver.findElement(uploadButton);
            uploadElem.sendKeys(doc);
            // Assuming there's a confirmation or success element per document upload
            WebElement confirm = driver.findElement(successMessage);
            assert confirm.isDisplayed();
        }
    }

    public void verifyDocumentsUploadSuccess() {
        // Implement verification logic here,
        // e.g., checking the list of uploaded documents and their metadata
    }
}