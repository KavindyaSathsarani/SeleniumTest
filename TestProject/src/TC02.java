import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC02 {
public static void main (String[]args){

    System.setProperty("webdriver.Chrome.driver","C:\\selenium\\drivers\\chromedriver.exe");
    Webdriver driver =new Chromedriver();
    driver.get("xxxxxxxxxxxxxxx");

    WebElement username =driver.findElement(By.id("username"));
    WebElement password =driver.findElement(By.id("password"));
    WebElement login =driver.findElement(By.xpath("xxxxxxxxxxxxx']"));
    username.sendKeys("user@.com"); password.sendKeys("T@123452");
    login.click();String actualurl="xxxxxxxxxxxxxxxxxxx";
    String expectedurl=driver.getCurrentUrl();if (actualurl.equalsIgnoreCase(expectedurl)){
        System.out.println("Test passed");} else {System.out.println("Test fail");}

}

}