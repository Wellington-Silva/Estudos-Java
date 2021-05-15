package Ordenação;

public class QuickSort implements IOrdenação{

    public static void quicksort(int[] vetor, int esquerda, int direita) {
        if(esquerda <= direita) {
            int p = separar(vetor, esquerda, direita);
            // p-1 é a esquerda do pivo, p+1 é a direita do pivo
            quicksort(vetor, esquerda, p-1);
            quicksort(vetor, p+1, direita);
        }
    }

    public static int separar(int[] vetor, int esquerda, int direita) {
        int pivo = vetor[esquerda], i = esquerda+1, j = direita;
        while(i <= j) {
            if(vetor[i] <= pivo) { i++; }
            else if(vetor[j] > pivo) { j--; }
            else if(i <= j) {
                trocar(vetor, i, j);
                i++; j--;
            }
        }
        trocar(vetor, esquerda, j);
        return j;
    }

    public static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

    @Override
    public void ordenar(int[] valores) {
        quicksort(valores, 0, valores.length - 1);
    }


    /*------------------QUICKSORT DECRESCENTE-------------------*/
    public static void quicksortDecresc(int vet[], int esquerda, int direita) {
        if (esquerda < direita) {
            int r = rompimento(vet, esquerda, direita);
            quicksortDecresc(vet, esquerda, r - 1);
            quicksortDecresc(vet, r + 1, direita);
        }
    }

    public static int rompimento(int vet[], int esquerda, int direita) {
        int i = esquerda + 1, j = direita;
        int pivo = vet[esquerda], aux;

        while (i <= j) {
            if (vet[i] >= pivo) i++;
            else if (pivo > vet[j]) j--;
            else {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
            }
        }
        i = j + 1;
        vet[esquerda] = vet[j];
        vet[j] = pivo;
        return j;

    }

    @Override
    public void ordenarDecrescente(int[] valores) {
        quicksortDecresc(valores, 0, valores.length - 1);
    }
}
