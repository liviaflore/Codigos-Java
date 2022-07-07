package br.com.generation;

import java.util.Scanner;

public class dados {

	public static void main(String[] args) {
		// Entrada e saída de dados
		
		Scanner leia = new Scanner(System.in); //entrada de dados do usuário
		
		
		int a, b, soma;
		
		System.out.println("Escreva o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("Resultado da soma: " + soma);
		
		
		
		leia.close();

	}

}
