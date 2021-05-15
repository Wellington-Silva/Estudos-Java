package Ordenação;

import java.util.Arrays;
import java.util.Random;

public class TesteQuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        QuickSort quicksort = new QuickSort();

        int vetor[] = new int[12]; //{8,3,5,33,4,2,9,12,1,7};
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(11);
        }

        System.out.print("Vetor Desordenado: ");
        System.out.println(Arrays.toString(vetor));

        quicksort.quicksort(vetor, 0, vetor.length-1);
        System.out.println("Vetor Ordenado Crescente: " + Arrays.toString(vetor));

        quicksort.quicksortDecresc(vetor, 0, vetor.length-1);
        System.out.println("Vetor Ordenado Decrescente: " + Arrays.toString(vetor));
    }
}
