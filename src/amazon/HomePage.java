package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {



    String ChromeDriver = "webdriver.chorme.driver";
    String chormDriverPath = "BrowserDriver\\mac\\chormdriver.exe ";

    public static void main(String[] args) throws InterruptedException {


// driver.findElement(By.id("kjdkfjsd")).click();
// driver.findElement(By.name("kjdkfjsd")).click();
// driver.findElement(By.tagName("kjdkfjsd")).click();
// driver.findElement(By.className("kjdkfjsd")).click();
// driver.findElement(By.linkText("kjdkfjsd")).click();
// driver.findElement(By.partialLinkText("kjdkfjsd")).click();
// driver.findElement(By.cssSelector("kjdkfjsd")).click();
// driver.findElement(By.xpath("kjdkfjsd")).click();


// Test Case 1: verify that amazon home page is appears as expected.

        System.setProperty("web driver.chrome.driver", "&2. Path From Content Root");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        driver.manage().window().maximize();
        Thread.sleep(5000);


        String title = driver.getTitle();
        System.out.println(title);




        Thread.sleep(5000);

        driver.quit();
//            driver.close();
        }

    }


