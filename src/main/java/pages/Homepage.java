package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	private WebDriver driver;
	
	List<WebElement> listaProdutos = new ArrayList<WebElement>();
	
	private By produtos = By.xpath("//img[contains(@class,'size-thumbnail wp-image-3214 alignright')]");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public int contarProdutos() {
		carregarListaProdutos();
		return listaProdutos.size();
	}

	private void carregarListaProdutos() {
		listaProdutos = driver.findElements(produtos);
		
	}
}
