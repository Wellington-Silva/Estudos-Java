package Interface_forms_geometric;

public class ParalelepipedoRetangulo extends Poliedro{

    public ParalelepipedoRetangulo(int qtdVertice, int qtdArestas, int qtdFaces, double lado1, double lado2, double altura) {
        super(qtdVertice, qtdArestas, qtdFaces, lado1, lado2, altura);
    }

    public void ParalelepidedoRetangulo () {
        calcularArea();
        calcularVolume();
    }

    public double calcularArea() {
        return 2*(getLado1()*getLado2() + getLado1()*getAltura() + getLado2()*getAltura());
    }

    public double calcularVolume() {
        return getLado1()*getLado2()*getAltura();
    }
}
