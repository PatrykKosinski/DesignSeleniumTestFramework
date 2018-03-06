import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
      //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

        driver = new ChromeDriver();
        driver.get("https://kwejk.pl/");
}

    @Test
    public void LoginApp(){
        LoginPage lp = new LoginPage(driver);
        lp.setUserId("patryk.kosinski@gmail.com");



}

}
