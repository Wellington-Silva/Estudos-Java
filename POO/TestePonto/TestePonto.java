package TestePonto;
import java.util.Scanner;
public class TestePonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Ponto pt = new Ponto();
        pt.informarDados(2.5, 1.2, "Azul");
        pt.imprimir();
        
        Circunferencia circ = new Circunferencia();
        circ.informarDados(pt, 2, "Blue", "Black");
        circ.imprimirDados();
        
        // VETOR DO PONTO
        double ponto[] = new double[10];
        for(int i=0; i<ponto.length; i++) {
            System.out.println("Informe um ponto X: ");
            ponto[i] = sc.nextDouble();
            System.out.println("Informe um ponto Y: ");
            ponto[i] = sc.nextDouble();
            System.out.println("informe uma cor: ");
            ponto[i] = sc.nextDouble();
        }
        
        // VETOR DE CIRCUNFERÊNCIA
        double circu[] = new double[10];
        for(int i=0; i<circu.length; i++) {
            System.out.println("Informe o centro: ");
            circu[i] = sc.nextDouble();
            System.out.println("Informe o raio: ");
            circu[i] = sc.nextDouble();
            System.out.println("Informe a cor da linha: ");
            circu[i] = sc.nextDouble();
            System.out.println("informe a cor do preenchimento: ");
            circu[i] = sc.nextDouble();
        }
    }   
}
