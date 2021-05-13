package cifradecesar;
import java.util.Scanner;
public class CifradeCesar {   
       public static String encriptar(int key, String text) {
        StringBuilder textCifrad = new StringBuilder();
        int tamanhoText = text.length();

        for (int i=0; i<tamanhoText; i++) {
            int letterCifrada = ((int) text.charAt(i)) + key;

            while (letterCifrada > 126) {
                letterCifrada -= 94;
            }
            textCifrad.append((char) letterCifrada);
        }
    return textCifrad.toString();
}
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um texto para ser criptografado: ");
            String text = entrada.nextLine();
            System.out.print("Digite a chave para o deslocamento: ");
            int key = entrada.nextInt();

            String textoCriptografado = encriptar(key, text);

            System.out.println("TEXTO CRIPTOGRAFADO: " + textoCriptografado);

        } catch (RuntimeException e) {
            System.out.println("Chave Incorreta! Por favor, execute o programa novamente com outra chave");           
        }
    }
}