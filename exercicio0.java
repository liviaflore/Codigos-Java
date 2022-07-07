package br.com.generation;

import java.util.Scanner;

public class exercicio0 {

	public static void main(String[] args) {
		// Exercício de cálculo
		
		Scanner leia = new Scanner(System.in);
		double galoes, litros;
		
		
		System.out.println("Escreva a quantidade de galões: ");
		galoes = leia.nextInt();
		
		litros = galoes * 3.600;
		
		System.out.println(galoes + " galões são: " + litros + " litros. ");
		
		
		
		leia.close();
		

	}

}
