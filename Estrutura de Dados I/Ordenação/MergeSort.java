package Ordenação;

public class MergeSort implements IOrdenação {

    public static void merge(int vA[], int[] vB, int[] vC) {
        int posA = 0, posB = 0, posC = 0;

        do {
            if(vA[posA] < vB[posB]) {
                vC[posC++] = vA[posA++];
            }
            else {
                vC[posC++] = vB[posB++];
            }
        }  while (posA < vA.length && posB < vB.length);

        while (posA < vA.length)
            vC[posC++] = vA[posA++];

        while (posB < vB.length)
            vC[posC++] = vB[posB++];
    }

    public static void quebrar(int[] vetC) {
        if(vetC.length >= 2) {
            int meio = vetC.length / 2;
            int[] vetA = new int[meio];
            int[] vetB = new int[vetC.length-meio];

            for (int i = 0; i < meio; i++) {
                vetA[i] = vetC[i];
            }

            for (int i = meio; i < vetC.length; i++) {
                vetB[i-meio] = vetC[i];
            }

            quebrar(vetA);
            quebrar(vetB);

            merge(vetA, vetB, vetC);
        }
    }

    @Override
    public void ordenar(int[] valores) {
        quebrar(valores);
    }

    /*-------------------MERGESORT DECRESCENTE-------------------*/
    public static void mergeDecresc(int vA[], int[] vB, int[] vC) {
        int posA = 0, posB = 0, posC = 0;

        do {
            if(vA[posA] < vB[posB]) {
                vC[posC++] = vA[posA++];
            }
            else {
                vC[posC++] = vB[posB++];
            }
        }  while (posA < vA.length && posB < vB.length);

        while (posA > vA.length)
            vC[posC++] = vA[posA++];

        while (posB < vB.length)
            vC[posC++] = vB[posB++];
    }

    public static void romper(int[] vetC) {
        if(vetC.length >= 2) {
            int meio = vetC.length / 2;
            int[] vetA = new int[meio];
            int[] vetB = new int[vetC.length-meio];

            for (int i = 0; i > meio; i++) {
                vetA[i] = vetC[i];
            }

            for (int i = meio; i < vetC.length; i++) {
                vetB[i-meio] = vetC[i];
            }

            romper(vetA);
            romper(vetB);

            merge(vetA, vetB, vetC);
        }
    }

    @Override
    public void ordenarDecrescente(int[] valores) {
        romper(valores);
    }
}
