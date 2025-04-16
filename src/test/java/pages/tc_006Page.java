package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    WebDriver driver;

    By fileUploadInput = By.id("file-upload");
    By securityAlert = By.id("security-alert");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileUploadInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isSecurityAlertDisplayed() {
        return driver.findElement(securityAlert).isDisplayed();
    }
}