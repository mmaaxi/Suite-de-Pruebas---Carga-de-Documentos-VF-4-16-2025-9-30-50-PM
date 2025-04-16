package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By uploadFileInput = By.id("file-upload");
    By errorMessage = By.id("file-upload-error");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadFileInput).sendKeys(filePath);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}