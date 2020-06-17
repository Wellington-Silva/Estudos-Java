package Brincar;
import java.util.Scanner;
import java.util.Random;
public class java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        int matriz01[][] = new int[3][3];
        int matriz02[][] = new int[3][3];
        int matrizSoma[][] = new int[3][3];
        int matrizSub[][] = new int[3][3];
        int escolha=0, constante=0;
        
        System.out.println("Somar as duas Matrizes - 1");
        System.out.println("Subtrair as duas Matrizes - 2");        
        System.out.println("Adicionar uma constatante as duas Matrizes - 3");
        escolha = sc.nextInt();
        
        for(int i=0; i<matriz01.length; i++){
            for(int j=0; j<matriz01.length; j++){
                matriz01[i][j] = ran.nextInt(50);
            }
        }
        for(int i=0; i<matriz01.length; i++){
            for(int j=0; j<matriz01.length; j++){
                matriz02[i][j] = ran.nextInt(50);
            }
        }
        
        for(int i=0; i<matriz01.length; i++){
            for(int j=0; j<matriz01.length; j++){
                if(escolha == 1){
                    matrizSoma[i][j]= matriz01[i][j] + matriz02[i][j]; 
                    System.out.print(matrizSoma[i][j] + " ");
                }else if(escolha == 2){
                    matrizSub[i][j]= matriz01[i][j] + matriz02[i][j];
                    System.out.print(matrizSub[i][j] + " ");
                }else if(escolha == 3){
                    System.out.println("Digite a constante: ");
                    constante = sc.nextInt();
                    matrizSoma[i][j] += constante;
                    System.out.print(matrizSoma[i][j] + " ");
                }                              
                else {
                    System.out.println("ERROR");
                }                
            }
            constante = 0;
            System.out.println();
        }   
    }
}
