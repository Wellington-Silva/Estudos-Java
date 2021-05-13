package Mercado_Praticando;
import java.util.Scanner;
public class Mercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u1 = new User("Wellington", 10.5, "Arvore@1", "well", "I582");
        Login lg = new Login("Wellington", 90, "Arvore@1", "hg", "123456789", "Well", "123456");

        System.out.println("Olá " + u1.getNome() + "! Você quer efeturar login? (S/N)");
        String result = sc.next();

        if(result.equalsIgnoreCase("S")) {
            lg.validarUser();
            lg.validarSenha();
        } else {
            System.out.println("Foi um prazer!");;
        }
    }
}
