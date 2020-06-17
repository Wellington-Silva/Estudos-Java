package questao38;
import java.util.Scanner;
public class Questao38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia, mes;
        //informar quantos dias se passaram desde o início do ano.
        System.out.print("Dia do Mês: ");
        dia = sc.nextInt();
        
        System.out.print("Mês do Ano: ");
        mes = sc.nextInt();
        
        int passou = ((mes - 1) * 30)+dia;

        System.out.println("Desde o inicio do ano se passaram " + passou);
    
    }
}
