package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
int segundos = 0, horas = 0, minutos = 0;

		
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o tempo de duração de um evento em uma fábrica expressa em segundos:");
		segundos = tec.nextInt();

		
		horas = (segundos/3600);
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;

		
		System.out.printf("O seu evento durou %d horas, %d minutos e %d segundos", horas, minutos, segundos);
	   	
	   	
		}
 
	
	}



