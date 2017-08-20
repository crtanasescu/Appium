import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by crtanasescu on 8/18/2017.
 */
public class ChooseAccountFragment {

    private AppiumDriver<MobileElement> driver;
    MobileElement popUp;
    MobileElement dissmisButton;


    public ChooseAccountFragment(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    boolean initElements(){
        try{
            popUp = driver.findElement(By.id("com.google.android.gms:id/credential_picker_layout"));
            dissmisButton = driver.findElement(By.id("com.google.android.gms:id/cancel"));
            return true;
        }catch(Exception ex){
            return false;
        }
    }


}
