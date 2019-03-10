package tsum.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.tsum.ru/registration/")
public class TsumRegistrationPage extends PageObject {

    public void FillEmailField (String email) {
        $(".//*[@placeholder='Email']").click();
        $(".//*[@placeholder='Email']").type(email);
    }

    public void FillPasswordField (String pw) {
        $(".//*[@type='password']").click();
        $(".//*[@type='password']").type(pw);
    }

    public void ClickSubmit () {
        $(".ui-button").click();
    }

}
