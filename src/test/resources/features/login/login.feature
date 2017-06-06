# language: pt

Funcionalidade: Login
	
	
#	Esquema do Cenário: Login com credenciais inválidas (Email e senha incorretos, dados vazios) 
#		Dado que eu estou na home page das lojas americanas
#		E Eu vou para a página de login
#		Quando Eu tento logar usando '<email>' e '<senha>'
#		Então login não é permitido
		
#    Exemplos:
#      | email               |  senha |
#      | teste@testx.de      | 123456 | 
#      | teste@testx.org.de  | 123456 |
#      |  										|        | 

  Cenário: Login com usuário existente
  	Dado que eu estou na home page das lojas americanas
  	E Eu vou para a página de login
  	Quando Eu tento logar usando 'testex@testex.de' e '123456'
  	Então 'Rodrigo' logou no sistema com sucesso