
		System.out.println("---------------------------------------");
        System.out.println("\n"+"Lojas Games - 572.198.047/0001-77\n");
        System.out.println("\n------------------------------------\n");
        System.out.println("comprador "+comprador[0] + " - CPF: " + comprador[1] + "\n");
		for (x = 0; x < 10; x++) {
			if (compras[x] != 0) {
				System.out.println(compras[x] + "\t" + mercadoria[x] + "\t R$ " + preco[x] + "\n");
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Imposto de ICMS R$ " + mat.arredondar(imposto, 2) + "\n");
		System.out.println("\n------------------------------------\n");
		System.out.println("Total da nota: R$ " + mat.arredondar((total + imposto),2)+ "\n\n");
		System.out.println("--------------------------------------\n");
		
		
		if (pagamento == '3') {
			parcelas = total / 2;
					System.out.println("Pagar em 2x de R$ " +mat.arredondar(parcelas,2) + "\n");
		} else  if (pagamento == '4') {
			parcelas = total / 3;
					System.out.println("Pagar em 3x de R$ " + mat.arredondar(parcelas,2) + "\n");
		}
		System.out.println("Deseja comprar mais? S para sim / N para não \n");
		leia(continuar2);
     	
	}
		else (continuar2 =='S' ou continuar2 == 's');

		System.out.println("-----Obrigado!!------\n");
		System.out.println("----Até Breve!!----");
	
			}
}
