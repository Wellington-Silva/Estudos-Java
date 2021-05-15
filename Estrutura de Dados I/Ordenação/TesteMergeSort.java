package Ordenação;

import java.util.Arrays;
import java.util.Random;

public class TesteMergeSort {

    public static void main(String[] args) {
        Random random = new Random();
        MergeSort merge = new MergeSort();

        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(4);
        }
        System.out.println("Vetor Desordenado: " + Arrays.toString(vetor));

        merge.quebrar(vetor);
        System.out.println("Vetor Ordenado Crescente: " + Arrays.toString(vetor));

        merge.romper(vetor);
        System.out.println("Vetor Ordenado Decrescente: " + Arrays.toString(vetor));
    }
}
