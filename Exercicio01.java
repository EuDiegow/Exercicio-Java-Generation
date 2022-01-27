package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio01 {

			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner entrada = new Scanner(System.in);
		int IdadeAnos = 0, IdadeMeses, IdadeDias, IdadeTotalDias;
		
	    System.out.print("Calculadora de idade em dias\n\n");
		
	    System.out.print("Digite os anos: ");
		IdadeAnos = entrada.nextInt();
		
	    System.out.print("Digite os meses: ");
		IdadeMeses = entrada.nextInt();

		System.out.print("Digite os dias: ");
		IdadeDias = entrada.nextInt();


		IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
		System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");

	}

}
