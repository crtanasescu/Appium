import org.junit.Test;

import java.time.Duration;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by crtanasescu on 8/18/2017.
 */
public class LinkedInTest extends BaseClass {

    @Test
    public void linkedInExampleTest() throws Exception{

        ChooseAccountFragment chooseAccountFragment = new ChooseAccountFragment(driver);
        SignInFragment signInFragment = new SignInFragment(driver);
        SendCredentialsFragment sendCredentialsFragment = new SendCredentialsFragment(driver);

        if(chooseAccountFragment.initElements()){
            assertTrue(chooseAccountFragment.popUp.isEnabled());
            assertTrue(chooseAccountFragment.dissmisButton.isEnabled());
            chooseAccountFragment.dissmisButton.click();
        }


        driver.runAppInBackground(Duration.ofSeconds(1));
        sleep(2*1000);
        signInFragment.initelements();
        assertTrue(signInFragment.logo.isDisplayed());
        assertTrue(signInFragment.subtitle.isDisplayed());
        assertTrue(signInFragment.joinNowButton.isDisplayed());
        assertTrue(signInFragment.signInButton.isDisplayed());
        assertEquals(signInFragment.signInButton.getText(), "SIGN IN");
        signInFragment.signInButton.click();


        chooseAccountFragment.initElements();
        assertTrue(chooseAccountFragment.popUp.isEnabled());
        assertTrue(chooseAccountFragment.dissmisButton.isEnabled());
        chooseAccountFragment.dissmisButton.click();


        sendCredentialsFragment.initElements();
        assertTrue(sendCredentialsFragment.email.isDisplayed());
        assertTrue(sendCredentialsFragment.password.isDisplayed());
        assertTrue(sendCredentialsFragment.signInButton.isDisplayed());
        sendCredentialsFragment.sendCredentials();
        sendCredentialsFragment.signInButton.click();








    }
}
