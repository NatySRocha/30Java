programa
{
inclua biblioteca Matematica
 --> Mat
	
	funcao inicio()
	{
	real x1
	real x2
	real y1
	real y2
	real d
	real p1
	real p2
		escreva("digite o valor de x1 :")
		leia(x1)
		escreva("digite o valor de x2 :")
		leia(x2)
		escreva("digite o valor de y1 :")
		leia(y1)
		escreva("digite o valor de y2 :")
		leia(y2)

		p1 = Matematica.potencia ((x2-x1),2)
		p2 = Matematica.potencia((y2-y1), 2)
		d = Matematica.raiz((p1+p2),2)

		escreva("/n a tal distancia é "+d)
      }	

}
			
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */