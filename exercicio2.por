programa
{
	
	funcao inicio()
	{
	
	real custo
	real distribuidor
	real imposto
	real custofinal
	
	
		escreva("digite o custo de fabrica:")
		leia (custo)

		distribuidor = custo * 0.28
		imposto = custo * 0.45
		custofinal = custo + distribuidor + imposto
		escreva("Custo ao consumidor: "+ custofinal)
		
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */