package Steps;

import comMotivitypages.CompediumScript;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.PendingException;

public class Steps {
    WebDriver driver;
    CompediumScript compediumScript;

    @Before
    public void webdriverInitialization() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @Given("Launch browser")
    public void launch_browser() {
        driver.get("https://compendiumdev.co.uk/");
        compediumScript = new CompediumScript(driver);
        System.out.println("Browser launches");

    }
    @When("click on contact")
    public void click_on_contact() {
        compediumScript.contact();
        System.out.println("Clicked on contact");

    }
    @Then("Fill the form")
    public void fill_the_form() throws Exception {
        compediumScript.formfilling();
        System.out.println("Form is filled");
    }
    @Then("Verify the form is submitted successfully")
    public void verify_the_form_is_submitted_successfully() throws Exception {
        compediumScript.formfilling();
        System.out.println("Form is submitted successfully");

    }
    @Then("verify the message")
    public void verify_the_message() throws Exception {
        compediumScript.formfilling();
        System.out.println("Message is verified");

    }
    @Then("Close the browser")
    public void close_the_browser() throws Exception {
        compediumScript.formfilling();
        System.out.println("Browser is closed");

    }
}
