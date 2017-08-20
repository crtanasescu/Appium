import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Created by crtanasescu on 8/18/2017.
 */
public class SendCredentialsFragment {


    AndroidDriver<MobileElement> driver ;
    MobileElement email;
    MobileElement password;
    MobileElement signInButton;

    public SendCredentialsFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }


    void initElements(){
        email = driver.findElement(By.id("com.linkedin.android:id/growth_login_join_fragment_email_address"));
        password = driver.findElement(By.id("com.linkedin.android:id/growth_login_join_fragment_password"));
        signInButton = driver.findElement(By.id("com.linkedin.android:id/growth_login_fragment_sign_in"));
    }

    void sendCredentials(){
        email.sendKeys("cristina.tanasescu93@gmail.com");
        password.sendKeys("Parola3#");
    }
}
