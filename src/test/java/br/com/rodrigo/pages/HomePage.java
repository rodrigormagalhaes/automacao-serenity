package br.com.rodrigo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * 
 * @author rodrigo
 * @since 24-02-2017
 */
@DefaultUrl("http://www.americanas.com.br/")
public class HomePage extends PageObject {
	
	/*
	 * WebElements da pagina
	 */
	@FindBy(className="usr-link")
	private static WebElementFacade triggerLogin; // area que aparece acoes de logar/registrar ao passar mouse
	
	@FindBy(className="usr-signin")
	private static WebElementFacade buttonLogin; // botao entrar
	
	@FindBy(css=".item-list .product-grid-item .card-product")
	private static WebElementFacade elementProdutoAleatorio;
	
	public void goToRegistrationPage() {
		
		triggerLogin.waitUntilVisible().click();
		buttonLogin.waitUntilVisible().click();
	}

}
