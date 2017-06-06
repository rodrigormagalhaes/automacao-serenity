package br.com.rodrigo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MinhaContaPage extends PageObject {

	/*
	 * WebElements da pagina
	 */
	@FindBy(css="#menudesktop[ng-show='!menuController.customer.guest'] .user-name.ng-binding")
	private static WebElementFacade labelNome;
	
	
	/**
	 * Valida nome do usuário logado na página minha conta
	 * @param nome
	 */
	public void validarNome(String nome) {
		labelNome.waitForCondition().until(
				ExpectedConditions.textToBePresentInElement(labelNome, nome));
		
	}

}
