package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class SignUp extends DriverSetup {

    @Test
    public void Register() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement SignUpBtn= driver.findElement(By.xpath("//a[@id='signin2']"));
        SignUpBtn.click();
        //Thread.sleep(3000);
        driver.findElement(By.id("sign-username")).sendKeys("jimgg");
        driver.findElement(By.id("sign-password")).sendKeys("jimaa#q");
        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
        //Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Sign up successful.");
        //Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);



    }



}
