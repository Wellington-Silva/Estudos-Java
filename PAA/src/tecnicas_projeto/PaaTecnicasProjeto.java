package tecnicas_projeto;

public class PaaTecnicasProjeto {
	public static boolean b = false;
	public static void main (String[] args) {
		String n[] = { "Lucas", "Wellington", "Caio", "Gabriele", "Maria" };
		String x = "WELLINGTON";
		
		int resultadoForcaBruta = forcabruta(x, n);
		System.out.println("Forca Bruta: " + resultadoForcaBruta);
		
		int resultadoMerge = conquista(x, n);
		System.out.println("Divisão e Conquista: " + resultadoMerge);
	}
	
	// -------------- FORÇA BRUTA -------------------
	
	public static int forcabruta (String x, String[] n) {
		for (int i = 0; i < n.length; i++) 
			if (x.equalsIgnoreCase(n[i])) return 1;
		return 0;
	}
	
	// ----------------- DIVISÃO E CONQUISTA ---------------------
	
	public static int conquista(String x, String[] n) {
        dividir(x, n);
        if (b) return 1; 
       	else return 0; 
    }
	
	// Função que faz a divisão antes da conquista
	public static void dividir(String x, String n[]) {
		if (n.length >= 2 && !b) {
            int pivo = n.length / 2;
            String vA[] = new String[pivo];
            String vB[] = new String[n.length - pivo];

            for (int i = 0; i < pivo; i++)
                vA[i] = n[i];
            for (int i = pivo; i < n.length; i++)
                vB[i - pivo] = n[i];

            dividir(x, vA);
            dividir(x, vB);
        }
		if (x.equalsIgnoreCase(n[0])) {
			b = true;
		}
	}
}
