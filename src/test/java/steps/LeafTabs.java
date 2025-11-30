package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;

public class LeafTabs {
WebDriver driver;

@Given("^Enter the url (.+)$")
public void enter_url(String urls)
{
driver=new FirefoxDriver();
driver.get(urls);
driver.manage().window().maximize();
}
 @Given("Enter the username")
    public void enter_user(DataTable data)
    {
       List<List<String>> list=data.asLists();
        driver.findElement(By.id("username")).sendKeys(list.get(1).get(0));
    }
    @Given("^Enter the password \"([^\"]*)\"$")
    public void enter_password(String user)
    {
        driver.findElement(By.id("password")).sendKeys(user);
    }
    @When("Click the button and Click thr crmsfa link and Click create Lead")
    public void click_the_button_and_click_thr_crmsfa_link_and_click_create_lead() throws InterruptedException {
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
    }
   @Given("Enter the all details createlead page")
  public void enter_value(DataTable data)
    {

        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        for(Map<String, String> map:maps)
        {
            driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(map.get("C_Name"));
            driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(map.get("F_Name"));
            driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(map.get("L_Name"));
        }



    }
    @When("click the createlead button")
   public void click_submit()
    {
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    }

}
