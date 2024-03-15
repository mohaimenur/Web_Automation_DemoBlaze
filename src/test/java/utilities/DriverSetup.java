package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class DriverSetup {
    public WebDriver driver;

    @BeforeMethod
    public WebDriver setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;


    }

    //@BeforeMethod
    //public void targetsite() throws InterruptedException{
        //driver.get("https://www.demoblaze.com/index.html");
        //Thread.sleep(2000);

    //}



    @AfterMethod
    public void quitDriver(){
        driver.quit();

    }


}
