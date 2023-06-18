package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


    @Test
    public void loginPositive() {
        String email = "benb@gmail.com", password = "Beny$123456";
        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().isLogged());

    }
}
