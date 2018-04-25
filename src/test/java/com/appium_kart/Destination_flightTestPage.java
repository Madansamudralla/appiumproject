package com.appium_kart;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Destination_flightTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "destinationbtn.click")
	private QAFWebElement destinationbtnClick;
	@FindBy(locator = "destinationselect.click")
	private QAFWebElement destinationselectClick;
	@FindBy(locator = "destinationcity.send")
	private QAFWebElement destinationcitySend;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getDestinationbtnClick() {
		return destinationbtnClick;
	}

	public QAFWebElement getDestinationselectClick() {
		return destinationselectClick;
	}

	public QAFWebElement getDestinationcitySend() {
		return destinationcitySend;
	}

	@QAFTestStep(description= "User click on destination btn")
	public void destinationclick() {
		destinationbtnClick.waitForVisible();
		destinationbtnClick.click();
	}
	
	@QAFTestStep(description= "User entered the destination city")
	public void desinationcity() {
		destinationcitySend.waitForVisible();
		destinationcitySend.click();
		destinationcitySend.sendKeys("Bangalore");
	}
	
	@QAFTestStep(description = "User selected the destination city")
	public void destinationselect() {
		destinationselectClick.waitForVisible();
		destinationselectClick.click();
	}
}
