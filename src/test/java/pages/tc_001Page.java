package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    By selectFileButton = By.id("selectFileButton");
    By uploadButton = By.id("uploadButton");
    By previewElement = By.id("previewElement");
    By successMessage = By.id("successMessage");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("url_de_la_página_de_carga");
    }

    public void selectPdfFile(String filePath) {
        WebElement fileInput = driver.findElement(selectFileButton);
        fileInput.sendKeys(filePath);
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewElement).isDisplayed();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}