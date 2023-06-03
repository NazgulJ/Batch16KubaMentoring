package mentoring_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsPractice {
    @Test
    public void practice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground ");

        WebElement javaAlert= driver.findElement(By.xpath("//p[contains(.,'JS Alert')]//button"));
        javaAlert.click();
        Thread.sleep(100);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement JSAlertclick=driver.findElement(By.xpath("//p[@class='text-gray-900 text-size-16 mt-10 text-black font-bold']"));
        JSAlertclick.click();
        alert.dismiss();
        Thread.sleep(1000);

        WebElement conformBox= driver.findElement(By.xpath(""));
        conformBox.click();



    }
}
