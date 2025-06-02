package classPracticeSession;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotLab02 {
	public static void main(String[] args) {
		// Step 1: Launch a new Chrome browser instance using Selenium WebDriver
		WebDriver driver = new ChromeDriver();

		// Step 2: Navigate to the Google homepage
		driver.get("https://www.google.com/");

		// Step 3: Locate the Google logo using a CSS selector
		// Note: This selector is subject to change if Google updates their page
		// structure
		// WebElement logo = driver.findElement(By.cssSelector(
		// "body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > svg"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > svg")));

		// Step 4: Capture a screenshot of the located WebElement (Google logo)
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);

// Step 5: Define the path and filename where the screenshot will be saved
//        File targetFile = new File("D:\\2025 Practice\\JavaScreenshots\\googleimage.jpeg");
//        int counter = 1;
//		  if(targetFile.exists()) {
//        	 targetFile = new File("D:\\2025 Practice\\JavaScreenshots\\googleimage_"+ counter+ ".jpeg");
//			counter++;
//        }
//		
		// Step 5: Define the path and filename where the screenshot will be saved
//		int counter = 1;
//		File targetFile;
//		do {
//			targetFile = new File("D:\\2025 Practice\\JavaScreenshots\\googleimage_" + counter + ".jpeg");
//			counter++;
//		} while (targetFile.exists());
		String basePath = "D:\\2025 Practice\\JavaScreenshots\\";
        String baseName = "googleimage";
        String extension = ".jpeg";

        File targetFile = new File(basePath + baseName + extension);

        // If "googleimage.jpeg" already exists, start appending _1, _2, etc.
        if (targetFile.exists()) {
            int counter = 1;
            do {
                targetFile = new File(basePath + baseName + "_" + counter + extension);
                counter++;
            } while (targetFile.exists());
        }
// Step 5: Generate timestamp-based filename
//        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        File targetFile = new File("D:\\2025 Practice\\JavaScreenshots\\googleimage_" + timestamp + ".jpeg");

		// Step 6: Copy the screenshot file to the desired location
		try {
			FileHandler.copy(sourceFile, targetFile);
			System.out.println("Screenshot of logo saved successfully.");
		} catch (IOException e) {
			// Handle any exceptions that may occur during file I/O
			e.printStackTrace();
		}

		// Step 7: Close the browser session
		driver.quit();
	}
}