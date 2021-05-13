package questao10;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o índice de poluição: ");
        double indice = sc.nextDouble();
        
        if (indice >= 0.05 && indice <0.29){
            System.out.println("Índice de poluição aceitável");
        }
        else if (indice == 0.3){
            System.out.println("Empresas do 1º grupo serão intimidas e suspenderá suas atividades");
        } else if(indice == 0.4){
            System.out.println("Empresas do 1º e 2º grupo serão intimadas e suspenderá suas atividades");
        } else if(indice >= 0.5){
            System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
        } else {
            System.out.println("Tem certeza deste índice? Verifique novamente");
        }     
    }    
}
