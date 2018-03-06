import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    //here is an area where we have to wire up elements from web into the code
    By username = By.name("userName");
    By password = By.name("pass");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUserId(String userId){
        driver.findElement(username).sendKeys(userId);

    }

}
