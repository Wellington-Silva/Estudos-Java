package teststring;
import java.util.Scanner;
public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                
        String s;
        int n, i, j;
        
        while(true){
            System.out.print("Digite um 'FIM' para encerrar.");
            s = sc.nextLine();
            
            if(s.equalsIgnoreCase("FIM")){
                break;
            }
            
            System.out.printf("Quantidade de Caracteres: ");
            n = s.length(); // tamanho da string (qtde de caracteres)
            
            for(i=0; i<n; i++){
                for(j=0; j<i; j++){
                    System.out.printf("%c", s.charAt(j));
                }
                System.out.printf("\n");
            }        
            System.out.printf("\n");
        }
    }   
}