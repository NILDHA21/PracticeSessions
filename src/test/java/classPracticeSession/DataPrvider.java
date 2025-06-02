package classPracticeSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPrvider {

	public static WebDriver driver;
	void setUp() {
		driver = new ChromeDriver();
		driver.get(null);
	}
}
