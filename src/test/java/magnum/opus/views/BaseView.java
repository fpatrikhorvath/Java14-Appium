package magnum.opus.views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseView {
    protected AndroidDriver driver;

    public BaseView(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /**
     * The visibility state of the view.
     *
     * @return true if it's visible
     */
    protected boolean isInitialized() {
        return false;
    }

    /**
     * Enters the specified text into the given mobile element.
     *
     * @param element The mobile element where the text will be entered.
     * @param text    The text to be entered into the mobile element.
     */
    protected void enterTextToElement(WebElement element, String text) {
        element.sendKeys(text);
    }


    protected void clickOnElement(WebElement element){
        element.click();
    }
    /**
     * Checks if the specified mobile element is visible on the mobile view.
     *
     * @param element The mobile element to be checked for visibility.
     * @return True if the mobile element is visible, any other case its false.
     */
    protected boolean isElementVisible(WebElement element) {
        return element.isDisplayed();
    }
}
