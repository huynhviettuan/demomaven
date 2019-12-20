package driverFactory;

public class DriverManagerFactory {
	public static DriverManager getDriverManager(String browserName) {
		DriverManager driverManager;
		switch (browserName) {
		case "chrome":
			driverManager = new ChromeDriverManager();
			break;
		case "firefox":
			driverManager = new FirefoxDriverManager();
			break;
		default:
			driverManager = new ChromeHeadlessDriverManager();
			break;
		}
		return driverManager;
	}
}
