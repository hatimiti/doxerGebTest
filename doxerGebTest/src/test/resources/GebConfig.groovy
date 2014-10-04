import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.ie.InternetExplorerDriver

//reportsDir = "${System.properties['user.home']}/Desktop/geb"

System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")
System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe")

driver = {
	def driver = new HtmlUnitDriver()
	driver.javascriptEnabled = true
	driver
}

environments {

	// -Dgeb.env=integration を指定したときの個別設定
//	integration {
//		reportsDir = "/test/report/geb"
//	}

	// -Dgeb.env=chrome or ie or firefox
	chrome {
		driver = { new ChromeDriver() }
	}

	ie {
		driver = { new InternetExplorerDriver() }
	}

	firefox {
		driver = { new FirefoxDriver() }
	}

}