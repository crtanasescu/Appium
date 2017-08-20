import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by crtanasescu on 8/18/2017.
 */
public class CapabilitiesClass {

    public AndroidDriver getLocalAndroid() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app","C:\\Users\\crtanasescu\\Desktop\\LinkedIn.apk");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("deviceName", "Galaxy S6");
        capabilities.setCapability("udid", "1115fb434fc63905");
        capabilities.setCapability("appPackage", "com.linkedin.android");
        capabilities.setCapability("appActivity", "com.linkedin.android.growth.login.LoginActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
        return driver;
    }
}
