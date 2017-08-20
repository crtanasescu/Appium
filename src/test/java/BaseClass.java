import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

/**
 * Created by crtanasescu on 8/18/2017.
 */
public class BaseClass extends CapabilitiesClass {
    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException{
        driver = getLocalAndroid();
    }


    @After
    public void tearDown() throws MalformedURLException{
        driver.quit();
    }

}
