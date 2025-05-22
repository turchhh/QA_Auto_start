import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookILCarroXPath {

    WebDriver driver = new ChromeDriver();


    @Test
    public void PhoneBookXpath(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));
        System.out.println(div.getText());
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        System.out.println(btnAbout.getAttribute("href"));
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("valeriya.qa@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("678512Lera!");
        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnRegistration.click();
        driver.quit();
    }

    @Test
    public void iLCarroXpath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSignUp.click();
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Valeriya");
        WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        inputLastName.sendKeys("Turchannikova");
        WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
        inputEmail.sendKeys("valeriya.qa@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
        inputPassword.sendKeys("678512Lera!");
        WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        checkBox.click();
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();

    }

    @Test
    public void loginIlCarroTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FirstTest.pause(2);
        WebElement btnLogIn = driver.findElement(By.xpath("//a[text()=' Log in ']"));
        btnLogIn.click();
        FirstTest.pause(2);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("valeriya.qa@gmail.com");
        FirstTest.pause(2);
        WebElement inputPassword = driver.findElement(By.xpath("//form/div[2]/input"));
        inputPassword.sendKeys("678512Lera!");
        FirstTest.pause(2);
        WebElement btnYalla = driver.findElement(By.xpath("//*[text()='Y’alla!']"));
        btnYalla.click();
        FirstTest.pause(4);
        WebElement btnLoggedIn = driver.findElement(By.xpath("//*[@type='button']"));
        btnLoggedIn.click();
        FirstTest.pause(2);
        driver.quit();
    }

    @Test
    public void loginPhoneBookTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FirstTest.pause(2);
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        FirstTest.pause(2);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("valeriya.qa@gmail.com");
        FirstTest.pause(2);
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("678512Lera!");
        FirstTest.pause(2);
        WebElement btnLoginForm = driver.findElement(By.xpath("//*[text()='Login']"));
        btnLoginForm.click();
        FirstTest.pause(2);
        driver.quit();
    }
}
