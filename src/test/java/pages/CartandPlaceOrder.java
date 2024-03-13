package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import static org.testng.AssertJUnit.assertTrue;

public class CartandPlaceOrder extends DriverSetup {



    @Test
    public void purchase() throws InterruptedException{

        driver.get("https://www.demoblaze.com/index.html");

        WebElement scroll = driver.findElement(By.xpath("//button[@id='next2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll);
        actions.build().perform();
        Thread.sleep(2000);
        scroll.click();
        Thread.sleep(2000);

        //driver.navigate().back();
        //Thread.sleep(3000);
        //driver.navigate().refresh();


        WebElement laptop = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
        actions.moveToElement(laptop);
        actions.build().perform();
        Thread.sleep(2000);
        laptop.click();
        Thread.sleep(2000);

        WebElement clickItem = driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
        clickItem.click();
        Thread.sleep(2000);

        String actualString = driver.findElement(By.xpath("//h2[contains(text(),'Sony vaio i5')]")).getText();
        assertTrue(actualString.contains("Sony vaio i5"));
        Thread.sleep(2000);

        String actualPrice = driver.findElement(By.xpath("//h3[@class='price-container']")).getText();
        Assert.assertEquals(actualPrice, "$790 *includes tax");
        Thread.sleep(2000);

        String linktext = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).getText();
        Assert.assertEquals(linktext, "Add to cart");
        Thread.sleep(2000);

        WebElement AddToCart = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        AddToCart.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Product added");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);

        WebElement homeback = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
        homeback.click();
        Thread.sleep(2000);

        WebElement phone = driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]"));
        phone.click();
        Thread.sleep(2000);

        WebElement AddCart = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        AddCart.click();
        Thread.sleep(2000);

        Alert alert2 = driver.switchTo().alert();
        Assert.assertEquals(alert2.getText(), "Product added");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        WebElement clickCart = driver.findElement(By.xpath("//a[@id='cartur']"));
        clickCart.click();
        Thread.sleep(4000);

        WebElement Delete = driver.findElement(By.xpath("//tbody/tr[2]/td[4]/a[1]"));
        Delete.click();
        Thread.sleep(3000);


        String cart =driver.findElement(By.xpath("//td[contains(text(),'Sony vaio i5')]")).getText();
        Assert.assertEquals(cart,"Sony vaio i5");
        Thread.sleep(5000);

        String price =driver.findElement(By.xpath("//td[normalize-space()='790']")).getText();
        Assert.assertEquals(price,"790");
        Thread.sleep(3000);

        WebElement PlaceOrderBtn = driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
        PlaceOrderBtn.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("jim");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("BD");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Dhaka");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("122323");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("June");
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");

        Thread.sleep(2000);
        WebElement purchaseBtn = driver.findElement(By.xpath("//button[contains(text(),'Purchase')]"));
        purchaseBtn.click();
        Thread.sleep(3000);

        String PopUp = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]")).getText();
        Assert.assertEquals(PopUp,"Thank you for your purchase!");
        Thread.sleep(2000);

        WebElement FinalOk = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
        FinalOk.click();
        Thread.sleep(2000);








    }


}
