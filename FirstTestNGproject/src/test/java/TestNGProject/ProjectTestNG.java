package TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ProjectTestNG {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void openbrowser(){
        System.setProperty("webdriver.chrome.driver", "D:\\testing Material\\First selenium project\\driver\\chromedriver.exe");
        driver.navigate().to("https://www.saucedemo.com/");

    };
    @AfterMethod
    public void closebrowser(){

        driver.quit();
    };
    @Test
    public void loginpage(){
        WebElement username=driver.findElement(By.id("user-name"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement button=  driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        button.click();
    };
}
