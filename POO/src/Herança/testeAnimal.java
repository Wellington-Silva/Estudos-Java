package Herança;
public class testeAnimal {
    public static void main(String[] args) {
        Animal camelo = new Mamifero("Camelo", 150,4, "Amarelo", "Terra",  2.0f, "Vegetação");
        camelo.imprimir();
        Animal tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5f, " Barbatanas e cauda");
        tubarao.imprimir();
        Animal ursocanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");
        ursocanada.imprimir();
    }
}
