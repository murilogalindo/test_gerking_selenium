package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    private static WebDriver driver;
    @Given("User in on login page")
    public void user_in_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "/home/murilo/Documentos/webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kabum.com.br");
        driver.findElement(By.id("li-login-usuario")).click();
    }

    @When("User enters username and password")
    public void i_enters_username_and_password() {
        driver.findElement(By.id("textfield12")).sendKeys("murilomag.galindo@gmail.com");
        driver.findElement(By.id("textfield15")).sendKeys("@murilo1324ads");
        driver.findElement(By.xpath("//*[@id=\"Table_3\"]/tbody/tr[2]/td/p[5]/input"));
    }

    @Then("The user access the home page")
    public void the_user_access_the_home_page() {
        String textoElement = driver.findElement(By.id("li-login-usuario")).getText();
        Assert.assertEquals("OLÁ, MUIRILO", textoElement);
    }
}
