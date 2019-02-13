import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Video {

    private WebDriver driver;
    private By title;
    private By description;

    public Video(WebDriver driver) {
        this.driver = driver;
        title = By.cssSelector("h1.title");
        description = By.cssSelector("#description > yt-formatted-string");
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public String getDescription() {
        return driver.findElement(description).getText();
    }
}
