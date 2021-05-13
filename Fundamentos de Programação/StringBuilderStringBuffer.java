package com.company;
public class StringBuilderStringBuffer {
	public static void main(String[] args) {
		
		//Estudando os métodos da StringBuffer e StringBuider
		//Que são praticamente a mesma coisa
		//Classes para concatenar várias Strings de uma vez
		//As formas mais elegantes e de maior desempenho
		
		/*Cria um buffer de String onde pode adicionar novas
		 *  Strings formando uma String única, um array de String*/
		StringBuffer sb1 = new StringBuffer("07497446107");
		sb1.insert(3, ".");
		sb1.insert(7, ".");
		sb1.insert(11, "-");
		sb1.append(" este");
		sb1.append(" é meu CPF");
		System.out.println(sb1.toString());
		
		StringBuffer sb2 = new StringBuffer(sb1);
		sb2.append(" e o meu nome é Wellington");
		sb2.append('.');
		System.out.println(sb2);
		
		//
		StringBuilder sb3 = new StringBuilder("WELLINGTON");
		sb3.reverse();
		System.out.println(sb3);
		
		StringBuilder sb4 = new StringBuilder("Certificação JAVA");
		System.out.println(sb4.substring(13, 17));
	}
	
	/*Diferença do StringBuffer pro StringBuilder
	 * Buffer trabalha com Threads safe e o Builder não 
	 * Isso sempre cai em entrevista de emprego
	 * */
}
