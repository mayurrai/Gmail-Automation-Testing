import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1part2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        email.sendKeys("xyz0000.com");

        WebElement nextButton1 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        nextButton1.click();

        Thread.sleep(5000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        password.sendKeys("abc202#");

        WebElement nextButton2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        nextButton2.click();

        Thread.sleep(5000);

        WebElement composeButton = driver.findElement(By.xpath("//div[text()='Compose']"));

        if (composeButton.isDisplayed()) {
            System.out.println("Gmail logged in successfully!");
        } else {
            System.out.println("Login failed!");
        }

        composeButton.click();

        Thread.sleep(5000);

        WebElement ToSend = driver.findElement(By.xpath("//*[@id=\":bp\"]"));
        ToSend.sendKeys("mayurrai2003@gmail.com");

        Thread.sleep(3000);
        WebElement MailSubject = driver.findElement(By.xpath("//*[@id=\":83\"]"));
        MailSubject.sendKeys("Testing mail");

        Thread.sleep(3000);
        WebElement bodyField = driver.findElement(By.xpath("//*[@id=\":9d\"]"));
        bodyField.sendKeys("This is a test email sent using Selenium.Done by Mayur");

        Thread.sleep(3000);
        WebElement sendButton4 = driver.findElement(By.xpath("//*[@id=\":7t\"]"));
        sendButton4.click();

        Thread.sleep(10000);

        driver.quit();
    }
}

