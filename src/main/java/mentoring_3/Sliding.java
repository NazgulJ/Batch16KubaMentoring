package mentoring_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Sliding {
    @Test
    public void slide() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground ");

        WebElement drop = driver.findElement(By.linkText("Drag & Drop Sliders"));
        drop.click();

        List<WebElement> allinput = driver.findElements(By.xpath("//input[@type='range']"));
        List<WebElement> allOutput = driver.findElements(By.cssSelector("output"));

        for (int i = 0; i < allinput.size(); i++) {
            while (!allOutput.get(i).getText().equals("50")) {
                if (allOutput.get(i).getText().equals("50")) {
                    break;
                } else {
                    allinput.get(i).sendKeys(Keys.ARROW_RIGHT);
                }

            }
        }
    }

    }

