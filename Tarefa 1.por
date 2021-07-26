programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	cadeia nome
	real P, E, M

	escreva("digite o peso do tomate")
	      leia (P)
	      limpa()

     escreva("digite excedente")
     leia(E)

     escreva("digite multa")
     leia(M)
	       se (P <=50) {
	       	escreva("você comprou ", P, " kg de tomate")
	       	escreva("/nexcedente", E , "kg")
	       	escreva ("/nmulta:R$" , M)
	       	       }
	       	       senao {
	       	       	E=P - 50
	       	       	M = E * 4.0

	       	       escreva("você comprou",P, "kg de tomate")
	       	       escreva("\nExcedente:", E,"kg")
	       	       escreva("\nmulta:R$", M)
	       	       	
	       	       }
	
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */