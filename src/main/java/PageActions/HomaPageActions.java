package PageActions;

import Helpers.ClickHelper;
import Helpers.KeyboardHelper;
import Helpers.WaitHelper;
import PageObjects.HomePageObject;

import java.net.MalformedURLException;

public class HomaPageActions {

    public static void clickCloseGenderSelectionPopup() throws MalformedURLException {
        KeyboardHelper.keybordESC();
        WaitHelper.waitElementInvisibility(HomePageObject.genderPopup);
    }

    public static void clickLoginButton() throws MalformedURLException {
        ClickHelper.click(HomePageObject.btnLogin);
    }
}


