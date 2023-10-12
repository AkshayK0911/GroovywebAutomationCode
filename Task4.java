package GroovyWeb;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://app.scrapc.com/");

		WebElement menu = driver.findElement(By.xpath("//img[@alt='profile_img']"));
		menu.click();

		WebElement emailField = driver.findElement(By.xpath("//input[@id=':r0:']"));
		emailField.sendKeys("akshaykavitake2@gmail.com");

		WebElement passwordField = driver.findElement(By.xpath("//input[@id=':r1:']"));
		passwordField.sendKeys("Testing123@");

		WebElement rememberCheckBox = driver.findElement(By.xpath("//input[@id='terms']"));
		rememberCheckBox.click();

		WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
		loginBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a//div/span[text()='PVC Vinyl in rolls'])[1]")));
		
		WebElement clickProduct = driver.findElement(By.xpath("(//a//div/span[text()='PVC Vinyl in rolls'])[1]"));
		clickProduct.click();

		WebElement addToCart = driver.findElement(By.xpath("//button[@type='button' and text()='Add to cart']"));
		addToCart.click();

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

		WebElement cart = driver.findElement(By.xpath("(//div[@class='MuiGrid-root css-7tfa2y'])[1]"));
		cart.click();

		WebElement cartItem = driver.findElement(By.xpath("(//a//div/span[text()='PVC Vinyl in rolls'])[1]"));

		System.out.println("Product is Successfully Added" + cartItem.getText());

		cartItem.click();

		WebElement chat = driver.findElement(By.xpath("//button[@type='button' and text()='Chats']"));
		chat.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		int pixelsToScroll = 800;
		js.executeScript("window.scrollBy(0, " + pixelsToScroll + ");");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]")));
		
		WebElement chatting = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		chatting.sendKeys("Hello", Keys.ENTER);
		chatting.sendKeys("Hello there!", Keys.ENTER);

		// Create a Sell Post

		WebElement createPost = driver.findElement(By.xpath("//span[@class='jss59' and text()='Create post']"));
		createPost.click();

		

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and text()='Sell post']")));

		WebElement sellPost = driver.findElement(By.xpath("//div[@role='button' and text()='Sell post']"));
		sellPost.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Category']")));

		WebElement productCategory = driver.findElement(By.xpath("//span[text()='Category']"));
		productCategory.click();

		WebElement paper = driver.findElement(By.xpath("//ul/li/div[text()='Paper']"));
		paper.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sub-category']")));

		WebElement productSubCategory = driver.findElement(By.xpath("//span[text()='Sub-category']"));
		productSubCategory.click();
		
		WebElement pSubCategory= driver.findElement(By.xpath("//ul/li/div[text()='Other Paper']"));
		pSubCategory.click();

		WebElement condition = driver.findElement(By.xpath("//span[text()='Condition']"));
		condition.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li/div[text()='new']")));

		WebElement newCondition = driver.findElement(By.xpath("//ul/li/div[text()='new']"));
		newCondition.click();

		WebElement productName = driver
				.findElement(By.xpath("//input[@placeholder='Product name']"));
		productName.sendKeys("Pen");
		

		WebElement productDescription = driver
				.findElement(By.id(":r3:"));
		productDescription.sendKeys("This is Pen");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		int pixelsToScroll1 = 800;
		js1.executeScript("window.scrollBy(0, " + pixelsToScroll1 + ");");
		
		WebElement quantity = driver.findElement(By.xpath("//input[@type='number']"));
		quantity.sendKeys("1");

		WebElement unit = driver.findElement(By.xpath("//span[text()='Unit']"));
		unit.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li/div[text()='Machinery']")));

		WebElement pUnit = driver.findElement(By.xpath("//ul/li/div[text()='Machinery']"));
		pUnit.click();

		WebElement supply = driver.findElement(By.xpath("//span[text()='Supply']"));
		supply.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li/div[text()='One time']")));

		WebElement supplyStatus = driver.findElement(By.xpath("//ul/li/div[text()='One time']"));

		supplyStatus.click();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		int pixelsToScroll2= 800;
		js2.executeScript("window.scrollBy(0, " + pixelsToScroll2 + ");");
		
		WebElement address = driver.findElement(By.xpath("(//input[@id='terms'])[1]"));
		address.click();

		WebElement priceOnReq = driver.findElement(By.xpath("(//input[@id='terms'])[2]"));
		priceOnReq.click();

		WebElement productTargetDetails = driver.findElement(By.xpath("(//input[@id='terms'])[3]"));
		productTargetDetails.click();

		WebElement post = driver.findElement(By.xpath("//button[text()='Post']"));
		post.click();

		Thread.sleep(5000);
		driver.quit();
	}

}
