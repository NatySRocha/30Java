programa
{
	
	funcao inicio ()
	{
	
      inteiro numero,soma = 0, contador = 0		
	 	escreva ("Digite um número:")
	 	leia (numero)

	 	faca {
	 		contador = contador + 1
	 		se (contador> 1) {
	 			escreva ("+")
	 		}
	 		escreva (contador)	 		 		
	 		soma = soma + contador
	 		
	 		 		
	 	} enquanto (contador <numero)
	 	escreva ("=", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */