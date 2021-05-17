package Facade;

public class SistemaDeLivros {
    public static void main(String[] args) {
        AcervoFacade facade = new AcervoFacade();

        facade.incluirPedido();
    }
}
