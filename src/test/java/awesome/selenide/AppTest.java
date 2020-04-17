package awesome.selenide;

import org.testng.annotations.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class AppTest {
    @Test
    public void userCanLoginByUsername() {
        open("http://192.168.17.194:8080/oauth/login");
        $("#username").clear();
        $("#username").setValue("18886885");
        $("#password").clear();
        $("#password").setValue("Admin@123");
        $(".login-form-item-children").find("button").click();
        sleep(3000);
    }
}
