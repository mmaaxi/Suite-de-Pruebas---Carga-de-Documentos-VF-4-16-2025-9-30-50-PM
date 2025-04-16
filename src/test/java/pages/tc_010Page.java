package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By logEntry = By.id("logEntry");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.navigate().to("http://example.com/upload");
    }

    public void uploadDocument() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click();
        // Add document upload mechanics here (e.g., sending file path to input)
    }

    public boolean isLogEntryCorrect() {
        WebElement logEntryElement = driver.findElement(logEntry);
        String logText = logEntryElement.getText();
        // Assume logText contains relevant info, validate it
        return logText.contains("hora") && logText.contains("usuario") && logText.contains("estado");
    }
}