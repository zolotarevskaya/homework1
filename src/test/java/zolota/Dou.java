package zolota;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dou extends TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testUntitled2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath(".//*[@href='http://dou.ua/calendar/']")).click();
    new Select(driver.findElement(By.name("city"))).selectByVisibleText("онлайн");
    new Select(driver.findElement(By.name("city"))).selectByVisibleText("Киев");
    new Select(driver.findElement(By.name("tag"))).selectByVisibleText("QA");
    driver.findElement(By.linkText("Курс «Автоматизированное тестирование. Selenium WebDriver + Python»")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
