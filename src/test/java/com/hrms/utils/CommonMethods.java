package com.hrms.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {

	/**
	 * Method that sends text to any given element
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Method return object of Java Script Executor type
	 * 
	 * @return js object
	 */
	public static JavascriptExecutor getJSExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;

	}

	/**
	 * Method performs click using JavaScript executor
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSExecutor().executeScript("arguments[0].click()", element);

	}

	/**
	 * Method scrolls up using JavaScript executor
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0,-" + pixel + ")");

	}

	/**
	 * Method scrolls down using JavaScript executor
	 * 
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0," + pixel + ")");

	}

	/**
	 * Method performs Explicit wait
	 * 
	 * @return new object of WebDriverWait
	 */
	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);

	}

	/**
	 * Method wait for element to be clickable.
	 * 
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Method wait for element visability
	 * 
	 * @param element
	 */
	public static void waitForVisability(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Method performs click
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * Method that create a screenshot and store it in specif
	 * 
	 * @param fileName
	 */
	public static byte[] takeScreen(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
		File file = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(Constants.SCREENSHOT_FILE_PATH + fileName + getTimeStamp() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}

	/**
	 * convert data to readable formate
	 * 
	 * @return
	 */
	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
		return sdf.format(date);

	}

	/**
	 * Method that performs click on Radio Button or CheckBox
	 * 
	 * @param radioOrCheckBoxes
	 * @param value
	 */
	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBoxes, String value) {
		String actualValue;
		for (WebElement radioOrCheckBox : radioOrCheckBoxes) {
			actualValue = radioOrCheckBox.getAttribute("value").trim();
			if (radioOrCheckBox.isEnabled() && actualValue.equals(value)) {
				jsClick(radioOrCheckBox);
				break;
			}

		}
	}

	/**
	 * Method will select an option from the dropdown by the given webelement and
	 * visible text value
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 */
	public static void selectDDValue(WebElement dd, String visibleTextOrValue) {
		try {
			Select select = new Select(dd);
			List<WebElement> options = select.getOptions();
			for (WebElement option : options) {
				if (option.getText().equals(visibleTextOrValue)) {
					select.selectByVisibleText(visibleTextOrValue);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method will select an option from the dropdown by index
	 * 
	 * @param dd
	 * @param index
	 */
	public static void selectDDValue(WebElement dd, int index) {
		try {
			Select select = new Select(dd);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will switch to frame by the given frame webelement
	 * 
	 * @param iFrame
	 */
	public static void switchToFrame(WebElement iFrame) {
		try {
			driver.switchTo().frame(iFrame);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method will switch to frame by the given frame index
	 * 
	 * @param iFrame
	 */
	public static void switchToFrame(int frameIndex) {
		try {
			driver.switchTo().frame(frameIndex);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method will switch to frame by the given frame name or id
	 * 
	 * @param iFrame
	 */
	public static void switchToFrame(String frameNameOrId) {
		try {
			driver.switchTo().frame(frameNameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method will switch to child window
	 */
	public static void switchToChildWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}

}
