import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest(){
//        System.out.println("+++++++");
        driver.get("https://ilcarro.web.app/search"); //браузер открой страницу
        driver.manage().window().maximize(); // открой на весь экран
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //ожидание загрузки каждого элемента стр
        ///////////
        pause(3);
        WebElement btnLetCarWork = driver.findElement(By.cssSelector("a[id='1']"));
        btnLetCarWork.click();
        pause(3);
        WebElement btnTermsOfUse = driver.findElement(By.cssSelector("*[ng-reflect-router-link='terms-of-use']"));
        btnTermsOfUse.click();
        pause(3);
        WebElement btnSignUp = driver.findElement(By.cssSelector("a[href='/registration?url=%2Fterms-of-use']"));
        btnSignUp.click();
        System.out.println(btnSignUp.getText()); //вернет текст содержащийся в элементе
        pause(5);
        WebElement inputName = driver.findElement(By.id("name"));
//        WebElement inputName = driver.findElement(By.cssSelector("*[name]"));
        inputName.sendKeys("Bobby");
        pause(3);
        WebElement inputLastName = driver.findElement(By.cssSelector("input[autocomplete='family-name']"));
        inputLastName.sendKeys("Brown");




    }

    public static void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
