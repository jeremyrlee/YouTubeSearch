import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Home is used for any actions related to the YouTube homepage.
 *
 * @author Jeremy Lee
 * @version 1.0
 */

public class Home {
    private WebDriver driver;
    private By searchField;
    private By searchButton;

    public Home(WebDriver driver) {
        this.driver = driver;
        searchField = By.id("search");
        searchButton = By.id("search-icon-legacy");
    }

    /**
     * Enters a given string into the search bar, and searches YouTube for relevant videos.
     * @param search the keywords that will be searched for on YouTube
     */
    public void searchVideo(String search) {
        driver.findElement(searchField).sendKeys(search);
        driver.findElement(searchButton).click();

        WebElement element = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/watch?v=dQw4w9WgXcQ']")));
    }

}
