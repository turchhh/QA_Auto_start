import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        HW
        FirstTest.pause(3);
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        FirstTest.pause(3);
        WebElement btnLogin = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLogin.click();
        FirstTest.pause(3);
        WebElement inputEmail = driver.findElement(By.name("email"));
        inputEmail.sendKeys("vturchannikova@gmail.com");
        FirstTest.pause(2);
        WebElement inputPassword = driver.findElement(By.cssSelector("*[placeholder='Password']"));
        inputPassword.sendKeys("678512Lera!");
        FirstTest.pause(2);
        WebElement btnLogin1 = driver.findElement(By.name("login"));
        btnLogin1.click();





    }
}
