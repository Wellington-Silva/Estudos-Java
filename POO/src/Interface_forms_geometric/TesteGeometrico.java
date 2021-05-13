package Interface_forms_geometric;
public class TesteGeometrico {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(8, 12, 6, 4, 5, 2);
        System.out.println(cubo1.toString());

        System.out.println();

        ParalelepipedoRetangulo pr1 = new ParalelepipedoRetangulo(1, 1, 0, 8, 6, 4);
        System.out.println(pr1);

        System.out.println();

        Cilindro cld1 = new Cilindro(4, 8);
        System.out.println(cld1.toString());
    }
}
