package Driver_Options;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.rmi.Remote;
import java.util.Set;

public class Diff_Browser {

    public static void main(String[] args) {
              //ChromeDriver
        ChromeDriver driver=new ChromeDriver();
        driver.get("");
        System.setProperty("webdriver.chrome.driver", "path");
        //EdgeDriver
        EdgeDriver driver1=new EdgeDriver();
        driver1.get("");
        System.setProperty("webdriver.edge.driver", "");
        //FirefoxDriver
        FirefoxDriver driver2=new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "");
        Cookie cook=new Cookie("data", "good");
        driver.manage().addCookie(cook);
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies= driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c.getName() + " : " + c.getValue());
        }

        ChromeOptions option=new ChromeOptions();
        option.addArguments("--start-maximized");
        option.addArguments("--headless=new");
        option.addArguments("--incognito");
        option.addArguments("--disable-notifications");
        option.addArguments("--disable-infobars");
        option.addArguments("--disable-popup-notifications");
        option.setAcceptInsecureCerts(true);
        option.addArguments("--disable-extensions");

    }

}
