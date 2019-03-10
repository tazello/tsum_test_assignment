package tsum.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://www.tsum.ru/login/")
public class TsumLoginPage extends PageObject {

    public void close_geo () {

        if ($(".geo-popup").isVisible()) {
            $(".ui-button_theme_quite-black").click();

        }
    }

    public void FillEmailField (String email) {
        $(".login-input").click();
        $(".login-input").type(email);
    }

    public void FillPasswordField (String pw) {
        $(".pwd-input").click();
        $(".pwd-input").type(pw);
    }

    public void ClickSubmit () {
        $(".ui-button").click();
    }

}
