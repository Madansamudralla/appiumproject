package com.appium_kart;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.pro.QAFSuiteListener;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Source_flightTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "fromFlight.click")
	private QAFWebElement fromFlightClick;
	
	@FindBy(locator = "source.send")
	private QAFWebElement sourceSend;
	
	@FindBy(locator = "selectsource.click")
	private QAFWebElement selectsourceClick;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getfromFlightClick() {
		return fromFlightClick;
	}
	
	public QAFWebElement getsourceSend() {
		return sourceSend;
	}
	public QAFWebElement getselectsourceClick() {
		return selectsourceClick;
	}

	@QAFTestStep(description="User click in from button")
	public void fromflight() {
		fromFlightClick.click();
	}
	
	@QAFTestStep(description = "User enter the source name")
	public void sourcename() {
		sourceSend.waitForVisible();
		//sourceSend.click();
		sourceSend.sendKeys("New Delhi");
		QAFTestBase.pause(1000);
	}
	
	@QAFTestStep(description = "User selected the source name")
	public void sourceselection() {
		selectsourceClick.click();
	}
	 
}
