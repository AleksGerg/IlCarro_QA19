package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{


    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginRegistrationForm(){
        click(By.xpath("//a[text()='Log in']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean isElementPresent(By locator) {

        return wd.findElements(locator).size() > 0;
    }

    public void fillLoginRegistrationForm(String email, String password) {
        type(By.xpath("//input[@id='email']"), email); ///password
        type(By.xpath("//input[@id='password']"), password);
    }

    public void submitLogin(){

        click(By.xpath("//button[text()='Y’alla!']"));
    }

    public boolean isLogged(){

        return isElementPresent(By.xpath("//h2[text()='Logged in success']"));
    }
}
