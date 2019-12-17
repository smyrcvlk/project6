package study.techno;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techlistic.com/p/selenium-practice-form.html" );

        driver.findElement( By.name( "firstname" )).sendKeys( "Sumeyra" );

        driver.findElement( By.name( "lastname" ) ).sendKeys( "Civelek" );

        List<WebElement> gender = driver.findElements( By.name( "sex" ) );
        WebElement secondElementOfGender = gender.get( 1 );
        secondElementOfGender.click();

        List<WebElement> experience = driver.findElements(By.name("exp"));
        experience.get(0).click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("12.16.2109");

        WebElement checkbox = driver.findElement( By.id( "profession-1" ) );
        checkbox.click();

        WebElement tool = driver.findElement( By.id( "tool-2" ) );
        tool.click();

        WebElement continent = driver.findElement(By.name("continents"));
        Select dropdown = new Select(continent);
        dropdown.selectByIndex(5);

//        WebElement selenium = driver.findElement(By.id("selenium commands"));
//        Select dropdown1 = new Select(selenium);
//        dropdown.selectByIndex(5);

//        WebElement select = driver.findElement( By.id( "selenium commands" ) );
//        List<WebElement> Selenium  = dropdown.getOptions();
//        for(WebElement element : Selenium) {

//         List<WebElement> selenium_commands = driver.findElements(By.name("selenium_commands"));
//         for (WebElement e: selenium_commands) {
//            e.click();
//         }
        Select select = new Select(driver.findElement(By.id("selenium_commands")));
//        select.deselectAll();
        List<WebElement> selectOptions = select.getOptions();
        for (WebElement option : selectOptions) {
            select.selectByVisibleText(option.getText());
        }





    }
}

