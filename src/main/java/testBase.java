import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class testBase {

    public static WebDriver driver = null;


    public void setUp() throws IOException {

        Properties p = new Properties();
        FileInputStream fi = new FileInputStream("C:\\Users\\Patryko\\Documents\\springUdemy\\task1\\src\\main\\java\\global.properties");

        p.load(fi);

        //System.out.println(p.getProperty("browser"));

        if(p.getProperty("browser").contains("firefox")){
            driver = new FirefoxDriver();
        }
        else if(p.getProperty("browser").contains("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                    driver = new ChromeDriver();
        }else{
            //internet explorer
        }

        driver.get(p.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
}
