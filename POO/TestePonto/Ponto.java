package TestePonto;
public class Ponto {
    public double x;
    public double y;
    public String cor;
    
    public void informarDados(double pX, double pY, String pCor) {
        x=pX;
        y=pY;
        cor=pCor;
        
    }
    
    public void alterarCor(String tCor) {
        this.cor = tCor;
    }
    
    public void imprimir() {
        System.out.println("Ponto X: " + x);
        System.out.println("Ponto Y: " + y);
        System.out.println("Cor: " + cor);
    }
}
