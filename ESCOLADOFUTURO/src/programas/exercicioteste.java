package programas;

import java.util.Scanner;

public class exercicioteste {

	public  static  void  main ( String [] args ) {

		Scanner leia = new Scanner(System.in);
		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina G. Souza  ", "Ana Paula Souza Dias  ",
				"Anderson Coelho da Costa", "Andrei Felipe Corr�a de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"C�ssia de A. N. Santos", "Emerson da Silva Santana", "Enzo Fulaneto  ", "Ester Gomes Neves Nascimento",
				"F�bio Campaner Suzuki", "Felipe Matos de Lima", "Felipe Souza da Silva", "Fl�vio Augusto da Costa",
				"Giovanna Siqueira Paiva dos Penedos", "Gustavo Mesquita Ferreira", "Henrique Uriel Lopes",
				"Jo�o Pedro Cruz Gomes", "Jos� P. M. F. Neto", "Let�cia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Nat�lia R. S. Rocha", "Pamela Paulino", "Renata dos Santos Ferreira",
				"Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva", "Sergio de Jesus Severo",
				"Stefani F. P. Tosi", "Talita g. m. g. Lima ", "Thiago da Silva Machado", "Vin�cios Lisboa da Silva",
				"Vinicius C. S. Francisco" };
		int notas[] = new int[alunes.length], auxNotas; // Mat - 0x
		String matriculas[] = new String[alunes.length];
		boolean ativo[] = new boolean[alunes.length]; // true
		String auxMat;
		char resposta;
		char status;

		// mostra todo mundo
		// la�o e pede:
		// pedi pela matricula 1 aluno
		// informar a nota deste aluno
		// vai informar se o aluno ainda continua ativo ou n�o [o usu�rio n�o pode
		// digitando verdadeiro ou falso
		// tem que fazer o processo at� que pergunta continua sim ou n�o seja n�o
		// ap�s mostra todos os alunos com nota pela regra
		// at� 5 - estude mais
		// acima de 5 - otimo, continue assim
		// aluno inativo ou aluno ativo baseado no true ou false de ativo
		// somente dos alunos que tem nota
 for(int x=0; x<alunes.length; x++) {
	 ativo[x]= true;
		 if(x>9 ) {
			 matriculas[x] = "MAT-"+(x+1);
		 }
		 else {
			 matriculas[x] = "MAT-0"+(x+1);
		 }
 }
 System.out.println("Matricula\tAlunes\t\t\tnotas\tStatus");
    for(int x=0; x<alunes.length; x++) {
    if (ativo[x]==true) {
    	System.out.println(matriculas[x]+"\t"+alunes[x]+"\t"+notas[x]+"\t"+"\t"+ativo[x]);
    	

		 }
 }
    do {
    	System.out.println("Digite o nome do alune");
    	auxMat = leia.next().toUpperCase();
    	for(int x=0;x<alunes.length; x++) {
    		System.out.println("Matricula\tAlunes\t\t\tnotas\tStatus");
    	System.out.println(matriculas[x]+"t"+alunes[x]+"t"+notas[x]+"\t"+"\t"+ativo[x]);
    	System.out.println("insira a nota");
    	auxNotas = leia.nextInt();
    	notas[x]=auxNotas;
    	if(notas[x]<5) {
    		System.out.println("Voc� precisa melhorar");
    		
    	}
    	else if (notas[x]>=5) {
    		System.out.println("Continue assim");
    	}
    	System.out.println("Atualize o status do Alune A/I");
    	status=leia.next().toUpperCase().charAt(0);
    	if(status=='A') {
    		ativo[x]=true;
    	}
    	else if (status =='I') {
    	ativo[x]=false;
    }
    	else {
    		System.out.println("Escolha invalida status permanece o mesmo");
    	
    	}

	
	}
    System.out.println("Deseja continuar? [s / n]:");
    resposta = leia.next().charAt(0);

	}while(resposta =='S');

}

}

