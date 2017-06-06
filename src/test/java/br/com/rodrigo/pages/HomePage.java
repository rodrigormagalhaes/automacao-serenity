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
@DefaultUrl("http://www.americanas.com.br")
public class HomePage extends PageObject {
	
	/*
	 * WebElements da página
	 */
	
	// modal entrar/cadastrar
	@FindBy(className="usr-link")
	private static WebElementFacade modalLogin; 
	
	//botão Entrar
	@FindBy(className="usr-signin")
	private static WebElementFacade buttonLogin;
	
	
	public void vaiParaPaginaLogin() {		
		modalLogin.waitUntilVisible().click();
		buttonLogin.waitUntilVisible().click();
		
	}

}
