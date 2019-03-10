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
public class WhenLoginWithIncorrectEmail{

    @Steps
    User karl;

    @Managed
    WebDriver browser;

    @Test
    public void shouldSignUp() {

        // Given
        karl.isOnTheLoginPage();

        // When
        karl.fillsRegisterForm("testco","11111111");

        // Then
        karl.shouldSeeErrorNotice( "email");
        /*
        здесь можно было бы написать полный текст ошибки, но у меня случились проблемки с кодировкой русского языка
        - локально тест проходил, а из терминала- фейлился из-за слетающей кодировки:С
         */
    }

}
