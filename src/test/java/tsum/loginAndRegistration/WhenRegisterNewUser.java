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
@Narrative(text={"Natasha can register wit unique email and valid password"})

public class WhenRegisterNewUser {

    @Steps
    User natasha;

    @Managed
    WebDriver browser;

    @Test
    public void ShouldRegister() {
    //Given
    natasha.isOnRegisterPage();

    // When
    natasha.registersWithUniqueEmail();

    // Then
    natasha.shouldSeeSuccessPopup();
    }
}
