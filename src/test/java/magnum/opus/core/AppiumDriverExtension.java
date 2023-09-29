package magnum.opus.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import magnum.opus.Utils;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Extension class for the AppiumDriver, it
 */
public class AppiumDriverExtension {
    private static AndroidDriver driver;

    /**
     * The user sets up the Android Driver
     * Sets the capabilities and the implicit wait
     */
    public AppiumDriverExtension() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityTypeExtended.PLATFORM_NAME, Utils.PLATFORM_NAME);
        desiredCapabilities.setCapability(MobileCapabilityTypeExtended.AUTOMATION_NAME, Utils.AUTOMATION_NAME);
        desiredCapabilities.setCapability(MobileCapabilityTypeExtended.UDID, Utils.UDID);
        desiredCapabilities.setCapability(MobileCapabilityTypeExtended.APP_PACKAGE, Utils.APP_PACKAGE);
        desiredCapabilities.setCapability(MobileCapabilityTypeExtended.APP_ACTIVITY, Utils.APP_ACTIVITY);
        try {
            URL appiumServer = new URL(Utils.APPIUM_SERVER);
            driver = new AndroidDriver(appiumServer, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(Utils.TIME_OUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the AndroidDriver instance.
     */
    public AndroidDriver getInstance() {
        return driver;
    }
}
