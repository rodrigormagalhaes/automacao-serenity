# language: pt

Funcionalidade: Login
	
	Esquema do Cenário: Login com credenciais inválidas (Email e senha incorretos, dados vazios) 
		Dado que eu estou na home page
		E Eu vou para a página de login
		Quando Eu tento logar usando '<email>' e '<senha>'
		Então login não é permitido
		
    Exemplos:
      | email               |  senha |
      | teste@testx.de      | 123456 | 
      | teste@testx.org.de  | 123456 |
