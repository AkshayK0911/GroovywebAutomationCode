package GroovyWeb;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrapcWebAutomation {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://app.scrapc.com/");

		// Task 1st

		WebElement menu = driver.findElement(By.xpath("//img[@alt='profile_img']"));
		menu.click();

		WebElement emailField = driver.findElement(By.xpath("//input[@id=':r0:']"));
		emailField.sendKeys("test123@gmail.com");

		WebElement passwordField = driver.findElement(By.xpath("//input[@id=':r1:']"));
		passwordField.sendKeys("1234");

		WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@id='terms']"));
		rememberCheckBox.click();

		WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
		loginBtn.click();

		Thread.sleep(1000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

		// Define the screenshot file path and name
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timestamp = dateFormat.format(new Date());
		String screenshotPath = "C:/Users/aksha/eclipse-workspace/MavenAutomation/screenShot/screenshot_" + timestamp
				+ ".png";

		try {
			// to Copy the screenshot to the specified path
			FileHandler.copy(sourceFile, new File(screenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(4000);
		
		// Task 2nd
		emailField.clear();
		emailField.sendKeys("akshaykavitake2@gmail.com");
		passwordField.clear();
		passwordField.sendKeys("Testing123@");
		// ememberCheckBox.click();
		loginBtn.click();

		Thread.sleep(2000);
		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		File sourceFile1 = screenshot1.getScreenshotAs(OutputType.FILE);

		// Define the screenshot file path and name
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timestamp1 = dateFormat1.format(new Date());
		String screenshotPath1 = "C:/Users/aksha/eclipse-workspace/MavenAutomation/screenShot/screenshot_" + timestamp1
				+ ".png";

		try {
			// to Copy the screenshot to the specified path
			FileHandler.copy(sourceFile1, new File(screenshotPath1));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Task 3rd

		menu.click();

		WebElement editProfile = driver.findElement(By.xpath("(//div[@role='button'])[4]"));
		editProfile.click();
		Thread.sleep(2000);

		TakesScreenshot screenshot2 = (TakesScreenshot) driver;
		File sourceFile2 = screenshot2.getScreenshotAs(OutputType.FILE);

		// Define the screenshot file path and name
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timestamp2 = dateFormat2.format(new Date());
		String screenshotPath2 = "C:/Users/aksha/eclipse-workspace/MavenAutomation/screenShot/screenshot_" + timestamp2
				+ ".png";

		try {
			// to Copy the screenshot to the specified path
			FileHandler.copy(sourceFile2, new File(screenshotPath2));
		} catch (IOException e) {
			e.printStackTrace();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstName.sendKeys("Spok");

		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lastName.sendKeys("Carter");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[4]")));

		WebElement languageDropdown = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		languageDropdown.click();

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div/ul/li/div[@class='MuiBox-root css-1r8zwgw' and text()='English (UK)']")));

		WebElement language = driver
				.findElement(By.xpath("//div/ul/li/div[@class='MuiBox-root css-1r8zwgw' and text()='English (UK)']"));
		language.click();

		WebElement country = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		country.click();

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div/ul/li/div[@class='MuiBox-root css-1r8zwgw' and text()='India']")));

		WebElement countryDropdown = driver
				.findElement(By.xpath("//div/ul/li/div[@class='MuiBox-root css-1r8zwgw' and text()='India']"));
		countryDropdown.click();

		WebElement firstName1 = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstName1.sendKeys("Spok");

		WebElement lastName1 = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lastName1.sendKeys("Carter");

		WebElement businessName = driver.findElement(By.xpath("//input[@placeholder='Business name']"));
		businessName.sendKeys("abc");

		WebElement businessType = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		businessType.click();

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div/ul/li/div[@class='MuiBox-root css-1r8zwgw' and text()='Trader']")));

		WebElement bType = driver
				.findElement(By.xpath("//div/ul/li/div[@class='MuiBox-root css-1r8zwgw' and text()='Trader']"));
		bType.click();

		WebElement bWebsite = driver.findElement(By.xpath("//input[@placeholder='Business website']"));
		bWebsite.sendKeys("https://www.abctest.com");

		WebElement mobileNo = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
		mobileNo.sendKeys("9876102345");

		WebElement landlineNo = driver.findElement(By.xpath("//input[@placeholder='Landline number']"));
		landlineNo.sendKeys("0000");

		WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/postal code']"));
		zipCode.sendKeys("411044");


		WebElement street = driver.findElement(By.xpath("//input[@placeholder='Street name']"));
		street.sendKeys("Abc, Pune");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		int pixelsToScroll = 500;
		js.executeScript("window.scrollBy(0, " + pixelsToScroll + ");");

		WebElement businessDesc = driver
				.findElement(By.id(":rc:"));
		businessDesc.sendKeys("The Business is of Trading");
		
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
		city.clear();
		city.sendKeys("Pune");

		WebElement saveBtn= driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		saveBtn.click();
		
		Thread.sleep(700);
		
		TakesScreenshot screenshot3 = (TakesScreenshot) driver;
		File sourceFile3 = screenshot3.getScreenshotAs(OutputType.FILE);

		// Define the screenshot file path and name
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timestamp3 = dateFormat3.format(new Date());
		String screenshotPath3 = "C:/Users/aksha/eclipse-workspace/MavenAutomation/screenShot/screenshot_" + timestamp3
				+ ".png";

		try {
			// to Copy the screenshot to the specified path
			FileHandler.copy(sourceFile3, new File(screenshotPath3));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Thread.sleep(5000);
		driver.quit();
	}

}
