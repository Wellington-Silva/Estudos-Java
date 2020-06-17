package questao18;
public class Questao18 {
    public static void main(String[] args) {
        int numerador = 1;
        int denominador = 1;
        int S = 0;
        while(denominador <= 50) {
            S = S + numerador/denominador;
            numerador =+ 2;
            denominador++;
        } 
        System.out.println(" S = " + S);        
    }   
}
