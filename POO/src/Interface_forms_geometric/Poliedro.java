package Interface_forms_geometric;

public abstract class Poliedro implements iFormaGeometrica{
    private int qtdVertice;
    private int qtdArestas;
    private int qtdFaces;
    private double lado1;
    private double lado2;
    private double altura;

    public Poliedro(int qtdVertice, int qtdArestas, int qtdFaces, double lado1, double lado2, double altura) {
        this.qtdVertice = qtdVertice;
        this.qtdArestas = qtdArestas;
        this.qtdFaces = qtdFaces;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public int getQtdVertice() {
        return qtdVertice;
    }

    public void setQtdVertice(int qtdVertice) {
        this.qtdVertice = qtdVertice;
    }

    public int getQtdArestas() {
        return qtdArestas;
    }

    public void setQtdArestas(int qtdArestas) {
        this.qtdArestas = qtdArestas;
    }

    public int getQtdFaces() {
        return qtdFaces;
    }

    public void setQtdFaces(int qtdFaces) {
        this.qtdFaces = qtdFaces;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean ehConvexo() {
        double calc = qtdVertice - qtdArestas + qtdFaces;
        if(calc != 2) {
            return false;
        }
        return true;
    }

    public String toString() {
        String convexo;
        if(ehConvexo()) {
            convexo = "É convexo";
        } else {
            convexo = "Não é convexo";
        }
        return "Área: " + calcularArea() + "\n" +
                "Volume: " + calcularVolume() + "\n" +convexo;
    }
}
