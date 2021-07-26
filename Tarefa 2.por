programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	real C, N , E = 0, salario
	
		escreva("digite seu codigo: ")
		leia (C)
		escreva("digite o numero de horas trabalhadas:")
		leia(N)
		limpa()

		se (N<=50){
			salario = N*10
			escreva("operário: ",C)
			escreva("\nhoras trabalhadas:",N)
			escreva("\nExcedentes: " ,E)
			escreva("\nSalario: R$",salario)
	
					}
					senao{
						E=N-50

						salario = (50*10) + (E * 20)
						escreva("Operário: ", C)
						escreva("\nhoras trabalhadas: ",N)
						escreva("\nexcedentes: ",E)
						escreva("\nsalario: R$ ",salario)
					}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */