package tsum.loginAndRegistration;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tsum.steps.User;

@RunWith(SerenityRunner.class)
@Narrative(text={"User wants to see profile"})
public class WhenLoginRegisteredUser {

    @Steps
    User potap;

    @Managed
    WebDriver browser;

    @Test
    public void shouldSignUp() {
        // Given
        potap.isOnTheLoginPage();

        // When
        potap.fillsRegisterForm("test@n.co","11111111");

        // Then
        potap.shouldBeRedirectedToProfilePage();
    }

}
