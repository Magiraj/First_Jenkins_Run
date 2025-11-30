package paral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMan {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public DriverMan()
    {

    }

  public static WebDriver  getDriver()
    {
if(driver.get()==null)
{
    driver.set(new ChromeDriver());

}
        return driver.get();  }
    public static void quit() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
