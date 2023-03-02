package comMotivitypages;

import CommonMethods.CommonActions;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readDataFile.ReadData;

import java.awt.print.PageFormat;
public class CompediumScript
{
    public WebDriver driver;
    CommonActions commonActions;
    ReadData readData;


    public CompediumScript(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        System.out.println("Assigning driver");
        commonActions = new CommonActions(driver);
        readData = new ReadData();

    }

    @FindBy(xpath = "//*[@id='cssmenu']/ul/li[2]/a")
    WebElement contact;

    @FindBy(xpath= "//input[@name='name']")
    WebElement username;


    @FindBy(xpath ="//input[@name='email']")
    WebElement useremail;

    @FindBy(xpath ="//textarea[@name='message']")
    WebElement message;

    @FindBy(xpath = "//button[@data-action='submit']")
    WebElement button;

    public void contact() {
        commonActions.clickOnElement(contact);
        contact.click();
    }

    public void formfilling() throws Exception {

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
        commonActions.EnterValueOnTextfield(username,readData.readFile("name"));
        commonActions.EnterValueOnTextfield(useremail,readData.readFile("email"));
        commonActions.EnterValueOnTextfield(message,readData.readFile("message"));
        commonActions.clickOnElement(button);
Thread.sleep(6000);
        username.sendKeys("DSaijyothi");
        Thread.sleep(5000);
        useremail.sendKeys("saijyothid12@gmail.com");
        Thread.sleep(4000);
        message.sendKeys("hii");
        Thread.sleep(2000);
        button.click();
        Thread.sleep(2000);



    }

}
