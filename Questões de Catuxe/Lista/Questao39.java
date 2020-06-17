package questao39;
import java.util.Scanner;
public class Questao39 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);      
         double nota1, nota2, nota3, media;
            double somaNota=0;
            System.out.print("Digite a 1º nota: ");
            nota1 = sc.nextDouble();

            System.out.print("Digite a 2º nota: ");
            nota2 = sc.nextDouble();

            System.out.print("Digite a 3º nota: ");
            nota3 = sc.nextDouble();

            somaNota = nota1+nota2+nota3;
            media = ((somaNota*1)+(somaNota*2)+(somaNota*3))/6;
            
            System.out.println("Media: " + media);
    } 
}
