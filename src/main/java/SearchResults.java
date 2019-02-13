import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * SearchResults is used for all actions related to the YouTube search results page.
 *
 * @author Jeremy Lee
 * @version 1.0
 */

public class SearchResults {
    private WebDriver driver;

    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * This method opens a video from the search result list with a given title.
     * @param title the title of the video to be opened.
     */
    public void openVideo(String title) {
        driver.findElement(By.linkText(title)).click();

        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("h1.title")));
    }
}
