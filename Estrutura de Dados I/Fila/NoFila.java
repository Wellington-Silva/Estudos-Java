package Fila;

public class NoFila <T> {
    // Atributos
    private T elemento;
    private NoFila<T> proximo;

    // Construtor
    public NoFila(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public T getElemento() {
        return this.elemento;
    }

    public void setElemento(T elemento) { this.elemento = elemento; }

    public NoFila<T> getProximo() { return proximo; }

    public void setProximo(NoFila proximo) {
        this.proximo = proximo;
    }
}
