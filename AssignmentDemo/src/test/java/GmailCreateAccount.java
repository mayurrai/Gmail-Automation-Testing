import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailCreateAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

        WebElement CreateAccount= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
        CreateAccount.click();


        WebElement PersonalUse = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]"));
        PersonalUse.click();

        WebElement FirstName= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/input"));
        FirstName.sendKeys("Mayur");

        WebElement LastName= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/input"));
        LastName.sendKeys("Rai");

        WebElement NextButton1= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span"));
        NextButton1.click();

         Thread.sleep(5000);

        WebElement BirthMonth = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select S = new Select(BirthMonth);
        S.selectByIndex(1);

        WebElement BirthDate = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/input"));
        BirthDate.sendKeys("02");


        WebElement BirthYear = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[3]/div/div/div[1]/div/div[1]/input"));
        BirthYear.sendKeys("2003");

        WebElement Gender= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/select"));
        Select G= new Select(Gender);
        G.selectByIndex(2);

        WebElement NextButton2= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span"));
        NextButton2.click();

        Thread.sleep(4000);

        WebElement PickElement= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div"));
        PickElement.click();

        WebElement GmailAddress = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input"));
        GmailAddress.sendKeys("xyz000");


        WebElement NextButton3 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span\n"));
        NextButton3.click();

        Thread.sleep(5000);

        WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
        Password.sendKeys("abc202#");

        WebElement ConfirmPass = driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
        ConfirmPass.sendKeys("abc202#");

        WebElement NextButton4= driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
        NextButton4.click();
    }
}
