package com.appium_kart;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SearchflightTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "Searchflightbtn.click")
	private QAFWebElement searchflightbtnClick;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getSearchflightbtnClick() {
		return searchflightbtnClick;
	}

@QAFTestStep(description = "User click on search button")	
public void searchflight() {
	searchflightbtnClick.waitForVisible();
	searchflightbtnClick.click();
	QAFTestBase.pause(4000);
}
}
