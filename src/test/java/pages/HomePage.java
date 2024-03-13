package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;


public class HomePage extends DriverSetup{

    @Test
    public void titleUrl(){
        driver.get("https://www.demoblaze.com/index.html");

        Assert.assertEquals(driver.getTitle(),"STORE"); //PRODUCT STORE
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.demoblaze.com/index.html");

    }


    @Test
    public void slider() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement sliders = driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
        sliders.click();
        Thread.sleep(2000);

        WebElement sliders2 = driver.findElement(By.xpath("//span[@class='carousel-control-prev-icon']"));
        sliders2.click();
        Thread.sleep(2000);
    }

    @Test
    public void menuBar() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
        home.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.demoblaze.com/index.html");
        driver.navigate().back();
        //Thread.sleep(2000);
        driver.navigate().forward();
        //Thread.sleep(2000);

        WebElement contact = driver.findElement(By.xpath("//a[normalize-space()='Contact']"));
        contact.click();
        Thread.sleep(3000);

        WebElement close = driver.findElement(By.xpath("//body/div[@id='exampleModal']/div[1]/div[1]/div[3]/button[1]"));
        close.click();
        Thread.sleep(2000);
        contact.click();
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@id='recipient-email']"));
        email.sendKeys("fsmohaimenur@gmail.com");
        Thread.sleep(3000);
        email.clear();
        email.sendKeys("mdrahmanmohaimenur@gmail.com");
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.xpath("//input[@id='recipient-name']"));
        name.sendKeys("jim");
        Thread.sleep(3000);

        WebElement message = driver.findElement(By.xpath("//textarea[@id='message-text']"));
        message.sendKeys("Hi, There!");
        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Send message')]"));
        submit.click();
        Thread.sleep(3000);


        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Thanks for the message!!");
        alert.accept();
        Thread.sleep(4000);

        WebElement about = driver.findElement(By.xpath("//a[normalize-space()='About us']"));
        about.click();
        Thread.sleep(3000);

        WebElement closeAbout = driver.findElement(By.xpath("//body/div[@id='videoModal']/div[1]/div[1]/div[3]/button[1]"));
        closeAbout.click();
        Thread.sleep(3000);

        about.click();

        WebElement cross = driver.findElement(By.xpath("//body/div[@id='videoModal']/div[1]/div[1]/div[1]/button[1]/span[1]"));
        cross.click();
        Thread.sleep(3000);




        //WebElement play = driver.findElement(By.cssSelector("button[title='Pause'] span[class='vjs-icon-placeholder']"));
        //play.click();
        //Thread.sleep(3000);

        //WebElement pause = driver.findElement(By.cssSelector("button[title='Pause'] span[class='vjs-icon-placeholder']"));
        //pause.click();
        //Thread.sleep(3000);
        //cross.click();
        //Thread.sleep(3000);





















    }







}
