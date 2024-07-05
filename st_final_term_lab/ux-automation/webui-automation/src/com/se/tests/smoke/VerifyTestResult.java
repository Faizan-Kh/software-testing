package com.se.tests.smoke;

import com.se.TestBase;
import com.se.config.ConfigHelper;
import com.se.config.Constants;
import com.se.utils.UtilsSet;
import com.se.utils.UtilsSet.*;
import org.testng.annotations.Test;

public class VerifyTestResult extends TestBase {
    @Test
    public void verifyTestResult() {
        UtilsSet.launchBrowserAndUrl(ConfigHelper.getInstance().getSubjectExpertUrl(), Constants.Tags.BY_BODY);
        UtilsSet.clickOnElement(Constants.WebDashboard.BY_DASHBOARD_LOGIN_BUTTON);

//        Perform Login

        UtilsSet.clearAndSetElementText(Constants.Login.BY_USERNAME_FIELD, ConfigHelper.getInstance().getStudentUsername());
        UtilsSet.clearAndSetElementText(Constants.Login.BY_PASSWORD_FIELD, ConfigHelper.getInstance().getStudentPassword());
        UtilsSet.clickOnElement(Constants.Login.BY_LOGIN_BUTTON);

//        Go to Tests URL
        UtilsSet.goToUrl(ConfigHelper.getInstance().getViewExamsUrl());
//        UtilsSet.clickOnElement();

    }
}
