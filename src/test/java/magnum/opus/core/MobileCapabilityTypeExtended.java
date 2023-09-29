package magnum.opus.core;

import io.appium.java_client.remote.MobileCapabilityType;

/**
 * The MobileCapabilityTypeExtended interface extends the MobileCapabilityType class
 * to provide additional capability names commonly used in Appium for mobile testing.
 */
public interface MobileCapabilityTypeExtended extends MobileCapabilityType {
    /**
     * Capability name for specifying the app package to launch.
     */
    String APP_PACKAGE = "appPackage";
    /**
     * Capability name for specifying the app activity to start.
     */
    String APP_ACTIVITY = "appActivity";
}
