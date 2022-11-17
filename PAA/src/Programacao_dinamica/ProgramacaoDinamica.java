package Programacao_dinamica;

public class ProgramacaoDinamica {

	public static void main(String[] args) {
        int[] S = { 7, 3, 2, 1, 5, 4, 8 };
        if (particao(S)) System.out.println("É possível particionar este subconjunto");
        else System.out.println("Não é possível particionar este subconjunto");   
	}
	
	// ---------------------- Soma de subconjuntos ----------------------

    public static boolean somaSubconjunto(int[] S, int n, int a, int b, int c) {
        if (a == 0 && b == 0 && c == 0) return true;
        if (n < 0) return false;

        boolean A = false;
        if (a - S[n] >= 0) A = somaSubconjunto(S, n - 1, a - S[n], b, c);

        boolean B = false;
        if (!A && (b - S[n] >= 0)) B = somaSubconjunto(S, n - 1, a, b - S[n], c);

        boolean C = false;
        if ((!A && !B) && (c - S[n] >= 0)) C = somaSubconjunto(S, n - 1, a, b, c - S[n]);

        return A || B || C;
    }

    // ---------------------- Particionando o conjunto S ----------------------
    
    public static boolean particao(int[] S) { 
        if (S.length < 3) return false;
        int soma = somaTotal(S);
        if ((soma % 3) == 0 && 
        		somaSubconjunto(S, S.length - 1, soma/3, soma/3, soma/3)) return true;
        else return false;
    }

    // ---------------------- Soma todos elementos do conjunto S ----------------------
    
    public static int somaTotal(int[] S) { 
    	int soma = 0;
    	for(int i = 0; i < S.length; i++) soma+= S[i];
    	return soma;
    }
}
