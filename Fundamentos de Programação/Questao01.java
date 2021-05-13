package com.company;
import java.util.Scanner;
public class Questao01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Desenvolva um programa para receber um texto
		 *digitado pelo usuário, e trocar todas as ocorrências 
		 *de uma palavra por outra. Tais palavras devem ser 
		 *informadas pelo usuário. Para isto, utilize o método 
		 *replace da classe String. O método deve receber a String 
		 *a ser procurada e a String a ser substituída (nesta ordem).
		 * O mesmo retorna uma nova String com todas as substituições 
		 * realizadas em todas as ocorrências da String procurada*/

		System.out.print("Digite um texto: ");
		String text = sc.nextLine();
		
		System.out.print("Digite o texto para ser substituido: ");
		String textSubstituto = sc.nextLine();
		
		String troca = text.replace(text, textSubstituto);
		System.out.println("Texto: " + text);
		System.out.println("Substituido: " + troca);
	}

}
