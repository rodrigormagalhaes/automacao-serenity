package br.com.rodrigo.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * 
 * @author rodrigo
 * @since 24-05-2017
 */
public class LoginPage extends PageObject {

	/*
	 * WebElements da página
	 */
	@FindBy(css="input[name='email']")
	private WebElementFacade inputEmail;
	
	@FindBy(css="input[name='password']")
	private WebElementFacade inputPassword;
	
	@FindBy(css="button[type='submit']")
	private WebElementFacade buttonLogin;
	
	@FindBy(css=".alert-error")
	private WebElementFacade elementError;
	
	private static final String MENSAGEM_DADOS_INCORRETOS = "E-mail ou senha incorretos";
	
	/**
	 * Preenche dados de login
	 */
	public void login(String email, String password) {
		inputEmail.waitUntilVisible().type(email);
		inputPassword.waitUntilVisible().type(password);
		buttonLogin.waitUntilVisible().click();
	}
	
	
	/**
	 * Valida mensagem de erro esperada
	 */
	public void assertLoginIncorreto() {
		elementError.waitForCondition().until(
				ExpectedConditions.textToBePresentInElement(elementError, MENSAGEM_DADOS_INCORRETOS));
	}


}