package homepage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import base.BaseTests;

public class HomepageTests extends BaseTests {

	@Test
	public void testContarProdutos_oitoProdutosDiferentes() {
		carregarPaginaInicial();
		assertThat(homepage.contarProdutos(), is(1));
	}

}
