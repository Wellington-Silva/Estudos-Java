package com.company;
import java.util.Scanner;
public class Questao03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Desenvolva um programa para receber um texto 
		 * digitado pelo usuário e exibir tal texto com 
		 * cada palavra em uma linha.*/
		
		System.out.println("Digite um texto: ");
		String text = sc.nextLine();
		
		int tamanho = text.length();
		for(int i=0; i<tamanho; i++){
			System.out.println(text.charAt(i));
			System.out.printf("\n");
		}
	}
}
