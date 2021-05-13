package Interface_forms_geometric;

public class Cubo extends Poliedro {

    public Cubo(int qtdVertice, int qtdArestas, int qtdFaces, double lado1, double lado2, double altura) {
        super(qtdVertice, qtdArestas, qtdFaces, lado1, lado2, altura);
    }

    public void Cubo() {
        calcularArea();
        calcularVolume();
    }

    public double calcularArea() {
        return 2*(getLado1()*getLado2() + getLado1()*getLado2() + getLado1()*getLado2());
    }

    public double calcularVolume() {
        return Math.pow(getQtdFaces(),3);
    }
}
