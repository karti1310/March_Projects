package com.Adactin.BaseClass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
		public static WebDriver driver;

		public static WebDriver browser(String type) {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (type.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}

		public static void clickOnElement(WebElement element) {
			element.click();

		}

		public static void inputElement(WebElement element, String data) {
			element.sendKeys(data);
		}

		public static void geturl(String url) {
			driver.get(url);
		}

		public void clear(WebElement element) {
			element.clear();

		}

		public static void close() {
			driver.close();
		}

		public static void drop_down(WebElement element, String type, String value) {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}

			else if (type.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}
		}

		public static void screenshot(String imageName) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(
					"C:\\Users\\karthi\\eclipse-workspace\\March_Project\\Screenshot2\\" + imageName + ".png");
			FileUtils.copyFile(src, dest);
		}

		public static void scrollinto(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		}

	}


