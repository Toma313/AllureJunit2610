import config.BaseClass;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import watchers.MyWatch;

@Epic("Allure name Epic annotation ")
@Feature("Allure name Feature annotation ")
@DisplayName("Login page suit")

public class FirstTest extends BaseClass {
    @Rule
    public
   MyWatch myWatch = new MyWatch();
     static LoginPage loginPage;
    @BeforeClass
    @Description ("Open page and create PO")
    public static void b(){
        driver.get("https://lms.ithillel.ua/auth");
        loginPage= PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    @Story("Allure name Story annotation")
    @Description("This test checked login by no valid users")
    @Severity(SeverityLevel.NORMAL)
    public void loginTest(){
        loginPage.comfirm("toma@gmail.com","login" );
    }
    @Test
    @Description("Check button name")
    @Severity(SeverityLevel.MINOR)
    public void test3 (){
        Assert.assertEquals("Forgot your password?", loginPage.loglink.getText());
    }
    @Test
    @Description("Check forward link")
    @Severity(SeverityLevel.CRITICAL)
    public void test4() throws InterruptedException {
        loginPage.loglink.click();
        Thread.sleep(2000);
        Assert.assertEquals("https://lms.ithillel.ua/auth/restore", driver.getCurrentUrl());
    }




}
