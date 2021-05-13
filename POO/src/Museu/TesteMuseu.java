package Museu;
public class TesteMuseu {
    public static void main(String[] args) {
        Artista art1 = new Artista("015947", "Pablo Picasso", "Espanha");
        Obra obra01 = new Pintura("132456", "1495–1498", "A Última Ceia", "4,6m X 8,8m", "Normal", "Oleo");
        Obra obra02 = new Escultura("321654", "século II a.C.", "Vénus de Milo", "2,02m de altura", "Normal", "Mármore de Paros");
        Obra obra03 = new Pintura("987321", "1907–1908", "O beijo", "1,8m X 1,8m", "Normal", "Acrílica");

        art1.setObra(obra01);
        art1.setObra(obra02);
        art1.setObra(obra03);

        art1.imprimir();
        obra01.imprimir();
        obra02.imprimir();
        obra03.imprimir();

        obra01.imprimir(art1);
    }
}
