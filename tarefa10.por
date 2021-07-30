programa
{
	
	funcao inicio ()
	{
	

		const inteiro MAX = 5
		inteiro vetor [MAX], i, maiorValor = 0

		para (i = 0; i <5; i ++) {
			escreva ("Digite o valor:")
			leia (vetor [i])	
			se (vetor [i]> maiorValor) {
				maiorValor = vetor [i]
			}
					
		}
		

		para (i = 0; i <5; i ++) {
			escreva ("Vetor [", i, "] =", vetor [i], "\n")
		}

		escreva ("\nO maior valor é:", maiorValor)
		

		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */