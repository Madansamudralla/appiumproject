package com.appium_kart;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlightresultTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {


	@FindBy(locator = "flightselection.click")
	private QAFWebElement flightselectionClick;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getfligtselectionClick() {
		return flightselectionClick;
	
}
	@QAFTestStep(description= "User selecting flight")
	public void flightselection() {
		flightselectionClick.waitForVisible();
		flightselectionClick.click();
		QAFTestBase.pause(4000);
	}
}

