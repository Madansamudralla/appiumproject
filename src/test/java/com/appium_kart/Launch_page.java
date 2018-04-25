package com.appium_kart;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Launch_page extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "switchflight.click")
	private QAFWebElement switchflightClick;
	
	@FindBy(locator = "switchflight2.click")
	private QAFWebElement switchflight2Click;
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	public QAFWebElement getswitchflightClick() {
		return switchflightClick;
	}
	
	public QAFWebElement getswitchflight2Click() {
		return switchflight2Click;
	}

	@QAFTestStep(description = "User switches to flights")
	
	public void switchtoflight() {
		
		try {
			switchflight2Click.waitForVisible();
			switchflight2Click.click();
			QAFTestBase.pause(2000);		
	}
		
	catch(Exception e) {
		switchflightClick.waitForVisible();
		switchflightClick.click();
		QAFTestBase.pause(2000);

	}
		
	}
	}