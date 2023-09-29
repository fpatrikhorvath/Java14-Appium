package magnum.opus.views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeView extends BaseView{
    @AndroidFindBy(id = "username")
    WebElement Login;
    public HomeView(AndroidDriver driver) {
        super(driver);
    }
}
