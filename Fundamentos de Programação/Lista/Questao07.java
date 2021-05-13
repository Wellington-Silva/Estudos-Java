package questao07;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1º Nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("2º Nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.println("Nº de aulas Ministradas: ");
        int aulasM = sc.nextInt();
        
        System.out.println("Nº de aulas assistidas: ");
        int assistidas = sc.nextInt();
        
        double freq = (aulasM/assistidas)*100;
        
        double mFinal = (nota1+nota2)/2;
        if(mFinal >= 6 && freq >= 75){
            System.out.println("Aprovado");
        } else{
           System.out.println("Reprovado");
        }
    }    
}
