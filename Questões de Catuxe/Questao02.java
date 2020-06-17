package com.company;
import java.util.Scanner;
public class Questao02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Faça o mesmo programa anterior, 
		 * mas com outro nome e altere para 
		 * que o mesmo permita substituir Strings 
		 * sem considerar maiúsculas e minúsculas.*/

		System.out.print("Digite um texto: ");
		String text = sc.nextLine();
		
		System.out.print("Digite o texto para ser substituido: ");
		String textSubstituto = sc.nextLine();
		
		String troca = text.replace(text, textSubstituto);
		System.out.println("Texto: " + text);
		System.out.println("Substituido: " + troca);
		//Não entendi a questão
	}
}
