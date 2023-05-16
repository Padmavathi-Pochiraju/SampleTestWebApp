package Tests;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
    
    WebDriver driver;
    
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    public void login() {
        String login_url = "https://opensource-demo.orangehrmlive.com/";
        driver.get(login_url);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        System.out.println(driver.getTitle());
    }
    
//    @Test
//    public void dashboard() {
//        
//        driver.findElement(By.id("menu_dashboard_index")).click();
//        driver.findElement(By.xpath("//*[@class=\oxd-main-menu-item active"))
//        String textPresent = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
//        
//        String textToBePresent = "DashBoard";
//        assertEquals(textPresent, textToBePresent);
//    }
    
    
    @AfterTest
    public void tearDown() {
            driver.quit();
    }

}