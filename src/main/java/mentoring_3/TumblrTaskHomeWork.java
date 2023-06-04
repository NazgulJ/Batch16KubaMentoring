package mentoring_3;

import Util.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TumblrTaskHomeWork {
    //homeWork

    /*
    Navigate to webapp
click login button
click continue with email button
provide email, and password (wrong credentials)
and validate the error message
driver quit
     */
    @Test
    public  void Practice(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.tumblr.com/");
        WebElement logIn=driver.findElement(By.xpath("//a[@class='Z8Ux2 qjTo7 IMvK3']"));
        logIn.click();
        WebElement email=driver.findElement(By.xpath("//button[@class='dKGjO']"));
        email.click();
        WebElement emailGM=driver.findElement(By.xpath("//input[@name='email']"));
        emailGM.sendKeys("fashionazi@mail.ru");
        WebElement next=driver.findElement(By.xpath("//button[@class='TRX6J CxLjL qjTo7 CguuB qNKBC']"));
        next.click();
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Set a password']"));
        password.sendKeys("1234");
        WebElement repeatPass=driver.findElement(By.xpath("//input[@placeholder='Repeat password']"));
        repeatPass.sendKeys("1234");
        WebElement nextButton=driver.findElement(By.xpath("//button[@type='submit']"));
        nextButton.click();
        WebElement redMessege=driver.findElement(By.xpath("//div[@class='a0A37 hAkP2']"));
        String actual= BrowserUtils.getText(redMessege);
        String expected="The password must be at least 8 characters long.";
        Assert.assertEquals(actual,expected);
        driver.quit();

    }
}
