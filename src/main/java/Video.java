import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Video is used for all actions related to a YouTube video page.
 *
 * @author Jeremy Lee
 * @version 1.0
 */

public class Video {

    private WebDriver driver;
    private By title;
    private By description;

    public Video(WebDriver driver) {
        this.driver = driver;
        title = By.cssSelector("h1.title");
        description = By.cssSelector("#description > yt-formatted-string");
    }

    /**
     *
     * @return the YouTube video title
     */
    public String getTitle() {
        return driver.findElement(title).getText();
    }

    /**
     *
     * @return the YouTube video description
     */
    public String getDescription() {
        return driver.findElement(description).getText();
    }
}
