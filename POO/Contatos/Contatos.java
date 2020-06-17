package contatos;
public class Contatos {
    public static void main(String[] args) {
        Contato contat = new Contato();
        contat.name = "Paulo";
        contat.Adress = "Brasília";
        contat.email = "Paulo123@gmail.com";
        
        contat.number = new String[4];        
        contat.number[0] = "+55 79 9 9958-7416";
        contat.number[1] = "+55 79 9 9987-6543";
        contat.number[2] = "+55 79 9 9919-4527";
        contat.number[3] = "+55 79 9 9999-9999";
        
        System.out.println("CONTATO - "+ contat.name);
        System.out.println("Endereço - "+ contat.Adress);
        System.out.println("E-mail - "+ contat.email);
        System.out.println("Número Pessoal - "+ contat.number[0]);
        System.out.println("Número Trabalho - "+ contat.number[1]);
        System.out.println("Número Artístico - "+ contat.number[2]);
        System.out.println("Número Alternativo - "+ contat.number[3]);
    }  
}

