import config.BaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.Utill;

@DisplayName("Login page suit")

public class FirstTest extends BaseClass {
     static LoginPage loginPage;
    @BeforeClass
    @Description ("Open page and create PO")
    public static void b(){
        driver.get("https://lms.ithillel.ua/auth");
        loginPage= PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    @Description("This test checked login by no valid users")
    public void loginTest(){
        Utill.print("HelloTest");
        System.out.println("hello");
        loginPage.comfirm("toma@gmail.com","login" );
    }

    @Test
    @DisplayName("testPrint")
    public void printTest(){
        Utill.print("HelloTestPRINTSPEPPPP");
    }




}
