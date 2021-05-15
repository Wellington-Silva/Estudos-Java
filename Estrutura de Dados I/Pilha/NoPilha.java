package Pilha;

public class NoPilha <T> {
    // Atributos
    private T elemento;
    private NoPilha<T> proximo;

    // Construtor
    public NoPilha(T elemento) {
        this.elemento =  elemento;
        this.proximo = null;
    }

    public T getElement() {
        return elemento;
    }

    public NoPilha<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoPilha<T> proximo) {
        this.proximo = proximo;
    }
}
