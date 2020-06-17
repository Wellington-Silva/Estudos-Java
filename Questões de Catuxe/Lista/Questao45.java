package questao45;
import java.util.Scanner;
public class Questao45 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double raio, pi= 3.14,area;
        
        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();
        
        area = (pi*pi)*raio;
        
        System.out.println("Área: do diâmetro da Pizza: " + area);
    }   
}
