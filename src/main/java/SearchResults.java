import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResults {
    private WebDriver driver;

    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }

    public void openVideo(String title) {
        driver.findElement(By.linkText(title)).click();

        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("h1.title")));
    }
}
