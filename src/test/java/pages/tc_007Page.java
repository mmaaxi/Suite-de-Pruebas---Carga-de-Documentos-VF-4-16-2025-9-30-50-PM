package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {
    WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void simulateSlowNetwork() {
        // Code to simulate slow network conditions
        // This could involve using Chrome DevTools Protocol to throttle the network
    }

    public void uploadPDF() {
        WebElement uploadInput = driver.findElement(By.id("upload"));
        uploadInput.sendKeys("/path/to/test.pdf");
    }

    public boolean isLoadingIndicatorVisible() {
        WebElement loadingIndicator = driver.findElement(By.id("loading-indicator"));
        return loadingIndicator.isDisplayed();
    }

    public boolean isUploadSuccessful() {
        WebElement successMessage = driver.findElement(By.id("success-message"));
        return successMessage.isDisplayed();
    }
}