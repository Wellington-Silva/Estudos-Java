package TestePonto;
public class Circunferencia {
    public Ponto centro;
    public double raio;
    public String corDaLinha;
    public String corDoPreenchimento;
    
    public void informarDados(Ponto pCentro, double pRaio, String pCorDaLinha, String pCorDoPreenchimento) {
        centro=pCentro;
        raio = pRaio;
        corDaLinha = pCorDaLinha;
        corDoPreenchimento = pCorDoPreenchimento;
    }

    public void area() {
        //A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²).
        double A = 3.14 * (Math.pow(raio, 2));
    }
    
    public void perimetro() {
        //P = 2 * π * r, onde: P = comprimento da circunferência ou perímetro.
        double P = 2 * 3.14 * raio;
    }
    
    public void imprimirDados() {
        System.out.println("Centro: " + centro.x + centro.y + centro.cor+raio);
    }
}
