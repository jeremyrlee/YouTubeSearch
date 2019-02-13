import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
    private WebDriver driver;
    private By searchField;
    private By searchButton;

    public Home(WebDriver driver) {
        this.driver = driver;
        searchField = By.id("search");
        searchButton = By.id("search-icon-legacy");
    }

    public void searchVideo(String search) {
        driver.findElement(searchField).sendKeys(search);
        driver.findElement(searchButton).click();

        WebElement element = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/watch?v=dQw4w9WgXcQ']")));
    }

}
