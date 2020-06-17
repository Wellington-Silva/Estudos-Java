package com.company;
import java.util.Scanner;
public class Questao04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String Nome, sobrenome, SOBRENOME;
	    int qtd=0;

	    //IDENTIFICAR O SOBRENOME
	    System.out.print("NOME: ");
	    Nome = sc.nextLine();
	        
	    qtd = Nome.lastIndexOf(' ');
	    sobrenome = Nome.substring(qtd+1, Nome.length());
	    
	    //COLOCANDO SOBRENOME EM MAIÚSCULO 
	    SOBRENOME = sobrenome.toUpperCase();
	    System.out.println(SOBRENOME);
		
	    //COLOCANDO NA FORMA DE REFERÊNCIA
		StringBuffer Referencia = new StringBuffer(Nome);
		Referencia.insert(0, SOBRENOME);		
		//VALIDAÇÃO PARA REMOVER O SOBRENOME DO FINAL
		if(Nome.endsWith(sobrenome)){
			Nome.replaceAll(sobrenome, " ");
		}
		System.out.println(Referencia);
	}
}
