import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TestSearchVideos contains tests that involve searching for YouTube videos.
 *
 * @author Jeremy Lee
 * @version 1.0
 */

public class TestSearchVideos {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.youtube.com");
    }

    @After
    public void tearDown() { driver.quit(); }

    /**
     * validateDescription searches for the Rick Astley video Never Gonna Give You Up, and checks that the description
     * matches an expected result.
     */
    @Test
    public void validateDescription() {
        Home home = new Home(driver);
        home.searchVideo("Never Gonna Give You Up");

        SearchResults results = new SearchResults(driver);
        results.openVideo("Rick Astley - Never Gonna Give You Up (Video)");

        Video video = new Video(driver);
        Assert.assertEquals("Rick Astley - Never Gonna Give You Up (Official Video) - Listen On Spotify: http://smarturl.it/AstleySpotify\n" +
                        "Learn more about the brand new album ‘Beautiful Life’: https://RickAstley.lnk.to/BeautifulLi...\n" +
                        "\n" +
                        "Buy On iTunes: \n" +
                        "Amazon: \n" +
                        "\n" +
                        "Follow Rick Astley\n" +
                        "Website: \n" +
                        "Twitter: \n" +
                        "Facebook: \n" +
                        "Instagram:  ...\n" +
                        "\n" +
                        "         \n" +
                        "\n" +
                        "\n" +
                        "Lyrics\n" +
                        "\n" +
                        "We're no strangers to love\n" +
                        "You know the rules and so do I\n" +
                        "A full commitment's what I'm thinking of\n" +
                        "You wouldn't get this from any other guy\n" +
                        "\n" +
                        "I just wanna tell you how I'm feeling\n" +
                        "Gotta make you understand\n" +
                        "\n" +
                        "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you\n" +
                        "\n" +
                        "We've known each other for so long\n" +
                        "Your heart's been aching, but\n" +
                        "You're too shy to say it\n" +
                        "Inside, we both know what's been going on\n" +
                        "We know the game and we're gonna play it\n" +
                        "\n" +
                        "And if you ask me how I'm feeling\n" +
                        "Don't tell me you're too blind to see\n" +
                        "\n" +
                        "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you\n" +
                        "\n" +
                        "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you\n" +
                        "\n" +
                        "(Ooh, give you up)\n" +
                        "(Ooh, give you up)\n" +
                        "Never gonna give, never gonna give\n" +
                        "(Give you up)\n" +
                        "Never gonna give, never gonna give\n" +
                        "(Give you up)\n" +
                        "\n" +
                        "We've known each other for so long\n" +
                        "Your heart's been aching, but\n" +
                        "You're too shy to say it\n" +
                        "Inside, we both know what's been going on\n" +
                        "We know the game and we're gonna play it\n" +
                        "\n" +
                        "I just wanna tell you how I'm feeling\n" +
                        "Gotta make you understand\n" +
                        "\n" +
                        "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you\n" +
                        "\n" +
                        "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you\n" +
                        "\n" +
                        "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you\"",
                video.getDescription());
    }
}
