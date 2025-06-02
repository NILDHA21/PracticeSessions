package classPracticeSession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotLab01 {
    public static void main(String[] args) {
        // Create a new instance of ChromeDriver (opens Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Navigate to Google's homepage
        driver.get("https://www.google.com/");

        // Cast the driver object to TakesScreenshot to capture screenshot
        TakesScreenshot tks = (TakesScreenshot) driver;

        // Capture screenshot and store it in a temporary file (source)
        File sourceFile = tks.getScreenshotAs(OutputType.FILE);

        // Define the target location to save the screenshot
        File targetFile = new File("D:\\2025 Practice\\JavaScreenshots\\google.jpeg");

        try {
            // Copy the screenshot from source to the specified target location
            FileHandler.copy(sourceFile, targetFile);
            System.out.println("Screenshot captured successfully.");
        } catch (IOException e) {
            // Handle exceptions that may occur during file operations
            e.printStackTrace();
        }

        // Optional: Close the browser
        driver.quit();
    }
}

