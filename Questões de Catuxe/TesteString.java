package testestring;
import java.util.Scanner;
public class TesteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Programa para mostrar os sobrenomes de nomes completos informados pelo usuário
        
        String nome, sobrenome;
        int i;

        System.out.print("Digite um nome: ");
        nome = sc.nextLine();
        
        i = nome.lastIndexOf(' ');
        sobrenome = nome.substring(i+1, nome.length());
        
        System.out.printf("Sobrenome: %s ", sobrenome);
    }
}
