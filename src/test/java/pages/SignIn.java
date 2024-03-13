package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class SignIn extends DriverSetup {

    @Test
    public void logIn() throws InterruptedException{
        driver.get("https://www.demoblaze.com/index.html");

        WebElement LoginBtn= driver.findElement(By.xpath("//a[@id='login2']"));
        LoginBtn.click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys("jimmmy");
        driver.findElement(By.id("loginpassword")).sendKeys("jim@##q");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        Thread.sleep(2000);
        WebElement Logout = driver.findElement(By.xpath("//a[@id='logout2']"));
        Logout.click();
        Thread.sleep(2000);


    }


}
