package lambda_test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test1 {
    //go with test annotation @Test


    @Test
    public void TC_01() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground ");
        WebElement inputFormSubmit = driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/input-form-demo']"));
        inputFormSubmit.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("Nazgul");
        WebElement email = driver.findElement(By.xpath("//input[@id='inputEmail4']"));
        email.sendKeys("Fashionazi@mail.ru");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword4']"));
        password.sendKeys("123");
        Thread.sleep(1000);
        WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("CodeFish");
        Thread.sleep(1000);
        WebElement webSite = driver.findElement(By.xpath("//input[@id='websitename']"));
        webSite.sendKeys("https://www.google.com/search?q=codefish&oq=codefish&aqs=chrome..69i57.2862j0j7&sourceid=chrome&ie=UTF-8");
        Thread.sleep(1000);
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.sendKeys("IL");
        Thread.sleep(1000);
        WebElement city = driver.findElement(By.xpath("//input[@id='inputCity']"));
        city.sendKeys("Chicago");
        WebElement address=driver.findElement(By.xpath("//input[@id='inputAddress1']"));
        address.sendKeys("2200 Devon ave 60656");
        WebElement address2=driver.findElement(By.xpath("//input[@id='inputAddress2']"));
        address2.sendKeys("1670 North E river ");
        WebElement state=driver.findElement(By.xpath("//input[@id='inputState']"));
        state.sendKeys("IL");
        WebElement zipCode=driver.findElement(By.xpath("//input[@id='inputZip']"));
        zipCode.sendKeys("12345");
        Thread.sleep(1000);
        WebElement submit=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit.click();




//if(allButton.get(i).getText().equel("submit")) {
//    allButton.get(i).click();
//}
//}
//List<WebElement> allMess=driver.findElement(By.xpath(''));
//    for(int i =o; i<allMess.size();i++){
//        if(allMess.get(i)){
//
//        }
//    }


//https://github.com/NazgulJ/Batch16KubaMentoring.git





    }
}









