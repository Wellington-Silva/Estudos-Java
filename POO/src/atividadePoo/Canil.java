package atividadePoo;
public class Canil {
    public static void main(String[] args) {
        Vacina a = new Vacina("anti-rábica", 1, "10/10/2021", "01/10/2020");
        Vacina b = new Vacina("trivalente", 2, "20/05/2022", "10/01/2020");
        Vacina c = new Vacina("tetravalente ", 3, "30/01/2023", "10/12/2020");

        // Primeiro cachorro
        Cachorro dog1 = new Cachorro("Tobi", "PitBull", 'M', "Azulão", 0.58);
        dog1.setPeso(5.0);
        dog1.setIdade(7);

        dog1.crescer(0.5);
        dog1.comer(10);
        dog1.terfilhote(2);

        dog1.vacinar(a);
        a.aplicar("11/09/2021");

        dog1.imprimir();
        a.imprimir();

        dog1.correr();
        dog1.latir();
        dog1.cavar();

        System.out.println("-----------------------------------------------------------------------------------------");

        // Segundo cachorro
        Cachorro dog2 = new Cachorro("Bethoven", "Pastor Alemão", 'M', "Preto", 1.0);
        dog2.setPeso(4.0);
        dog2.setIdade(5);

        dog2.crescer(0.5);
        dog2.comer(15);
        dog2.terfilhote(2);

        dog2.vacinar(b);
        b.aplicar("21/08/2022");

        dog2.imprimir();
        b.imprimir();

        dog2.correr();
        dog2.latir();
        dog2.cavar();

        System.out.println("-----------------------------------------------------------------------------------------");

        c.imprimir();

    }
}
