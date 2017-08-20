import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by crtanasescu on 8/18/2017.
 */
public class SignInFragment {

    AndroidDriver<MobileElement> driver;
    MobileElement logo;
    MobileElement subtitle;
    MobileElement joinNowButton;
    MobileElement signInButton;

    public SignInFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    void initelements(){
        logo = driver.findElement(By.id("com.linkedin.android:id/prereg_intro_logo"));
        subtitle = driver.findElement(By.id("com.linkedin.android:id/prereg_intro_tagline"));
        joinNowButton = driver.findElement(By.id("com.linkedin.android:id/growth_prereg_fragment_join_button"));
        signInButton = driver.findElement(By.id("com.linkedin.android:id/growth_prereg_fragment_sign_in_button"));
    }
}
