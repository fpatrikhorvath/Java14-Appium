package magnum.opus.views;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;
/**
 * BaseView is an abstract class representing a base view in a mobile application.
 * It provides common methods for interacting with mobile elements.
 */
public abstract class BaseView {
    protected AndroidDriver driver;
    /**
     * Constructor for initializing a BaseView object.
     *
     * @param driver The AndroidDriver instance used for interaction with the mobile app.
     */
    public BaseView(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /**
     * The visibility state of the view.
     *
     * @return true if it's visible
     */
    protected boolean isInitiali2zed() {
        return false;
    }

    /**
     * Enters the specified text into the given mobile element.
     *
     * @param element The mobile element where the text will be entered.
     * @param text    The text to be entered into the mobile element.
     */
    protected void enterTextToElement(MobileElement element, String text) {
        element.sendKeys(text);
    }


    protected void clickOnElement(MobileElement element) {
        element.click();
    }

    /**
     * Checks if the specified mobile element is visible on the mobile view.
     *
     * @param element The mobile element to be checked for visibility.
     * @return True if the mobile element is visible, any other case its false.
     */
    protected boolean isElementVisible(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException nsee) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
