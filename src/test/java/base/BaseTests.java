package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Homepage;

public class BaseTests {
	
	private static WebDriver driver;
	protected Homepage homepage;
	
	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "/home/sheila/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://www.multitude.trd.br/");
		homepage = new Homepage(driver);
	}
	
	@AfterAll
	public static void finalizar() {
		driver.quit();
	}

}
