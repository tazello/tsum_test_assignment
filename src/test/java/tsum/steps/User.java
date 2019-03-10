package tsum.steps;


import net.thucydides.core.annotations.Step;
import tsum.ui.*;
import java.util.Date;


import static org.junit.Assert.assertTrue;

public class User {

        TsumLoginPage tsumLoginPage;
        CurrentPage currentPage;
        PersonalProfile personalProfile;
        TsumRegistrationPage tsumRegistrationPage;


        @Step
        public void isOnTheLoginPage() {
            tsumLoginPage.open();
            tsumLoginPage.close_geo();

        }

        @Step
        public void isOnRegisterPage() {
           tsumRegistrationPage.open();

        }

        @Step
        public void fillsRegisterForm(String email, String password) {
            tsumLoginPage.FillEmailField(email);
            tsumLoginPage.FillPasswordField(password);
            tsumLoginPage.ClickSubmit();

        }

        @Step
        public void shouldBeRedirectedToProfilePage() {
           assertTrue(personalProfile.containsElements( ".personal-profile"));


        }

        @Step
         public void shouldSeeErrorNotice(String reason) {
            currentPage.containsElements( ".ui-notification");
            assertTrue(currentPage.element( ".ui-notification").containsText(reason));

        }

        @Step
        public void registersWithUniqueEmail (){
            Date date = new Date();
            long millis = date.getTime();
            String s = (String.valueOf(millis));

            String unique_email = "test_" + s + "@n.co";

            tsumRegistrationPage.FillEmailField(unique_email);
            tsumRegistrationPage.FillPasswordField("12312312");
            tsumRegistrationPage.ClickSubmit();

        }

        @Step
        public void registersWithExistingEmail(){
            tsumRegistrationPage.FillEmailField("test@n.co");
            tsumRegistrationPage.FillPasswordField("12312312");
            tsumRegistrationPage.ClickSubmit();
        }

        @Step
        public void shouldSeeSuccessPopup() {
            tsumRegistrationPage.waitFor( ".//*[@class='notice info']");
            assertTrue(tsumRegistrationPage.containsElements(".//*[@class='notice info']"));
        }
}
