package AmazonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ProductSearching{

    public  WebDriver driver;
    @BeforeTest
    public void baseState(){
        System.setProperty("webdriver.firefox.marionette", "lib//geckodriver.exe");
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
      driver.get("http://www.amazon.com/");
    }


    @Test
    public void IndianaJonesSearchSelenium() {
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).clear();
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("indiana jones blu ray");
    driver.findElement(By.xpath("//*[@id='nav-search']/FORM[1]/DIV[2]/DIV[1]/INPUT[1]")).click();
          Assert.assertEquals(driver.findElement(By.xpath("//*[@id='result_0']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/A[1]/H2[1]")).getText(),"Indiana Jones: The Complete Adventures");
    }

    @Test
    public void StarWarsSearchSelenium() {
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).clear();
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("star wars blu ray");
          driver.findElement(By.xpath("//*[@id='nav-search']/FORM[1]/DIV[2]/DIV[1]/INPUT[1]")).click();
      Assert.assertEquals(driver.findElement(By.xpath("//*[@id='result_0']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/A[1]/H2[1]")).getText(),"Star Wars Clone Wars - Season 1-5 [Blu-ray]");
    }
    @Test
    public void LordofTheRingsSearchSelenium() {
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).clear();
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("lord of the rings blu ray");
    driver.findElement(By.xpath("//*[@id='nav-search']/FORM[1]/DIV[2]/DIV[1]/INPUT[1]")).click();
      Assert.assertEquals(driver.findElement(By.xpath("//*[@id='result_0']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1]/H2[1]")).getText(),"The Lord of the Rings: The Motion Picture Trilogy");
    }

}
    