package br.com.rodrigo.steps;

import br.com.rodrigo.pages.HomePage;
import br.com.rodrigo.pages.LoginPage;
import br.com.rodrigo.pages.MinhaContaPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

/**
 * 
 * @author rodrigo
 * @since 24-05-2017
 */
public class LoginSteps {
	
	HomePage homePage;
	LoginPage loginPage;
	MinhaContaPage minhaContaPage;
	
	@Dado("^que eu estou na home page das lojas americanas$")
	public void que_eu_estou_na_home_page() {
		homePage.open();

	}

	@Dado("^Eu vou para a página de login$")
	public void eu_vou_para_a_página_de_login() {
		homePage.vaiParaPaginaLogin();

	}

	@Quando("^Eu tento logar usando '(.*)' e '(.*)'$")
	public void eu_tento_logar(String email, String senha) {
		loginPage.login(email, senha);

	}

	@Então("^login não é permitido$")
	public void login_não_é_permitido() {
		loginPage.assertLoginIncorreto();
		
	}
	
	@Então("^'(.*)' logou no sistema com sucesso$")
	public void logou_no_sistema_com_sucesso(String nome) {
		minhaContaPage.validarNome(nome);

	}



}
