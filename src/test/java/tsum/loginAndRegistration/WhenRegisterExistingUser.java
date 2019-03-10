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
@Narrative(text={"Karl is an idiot"})

public class WhenRegisterExistingUser {

    @Steps
    User masha;

    @Managed
    WebDriver browser;

    @Test
    public void ShouldNotRegister() {
        //Given
        masha.isOnRegisterPage();

        // When
        masha.registersWithExistingEmail();

        // Then
        masha.shouldSeeErrorNotice("email");
    }
}
