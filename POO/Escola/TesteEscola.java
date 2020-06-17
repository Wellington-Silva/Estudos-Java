package Escola;
public class TesteEscola {
    public static void main(String[] args){ 
        
        Curso c1 = new Curso();
        c1.informarDados("01", "BSI", "Formar profissionais em programação.");
        Curso c2 = new Curso();
        c2.informarDados("02", "Elétrica", "Formar alunos");
        Curso c3 = new Curso();
        c3.informarDados("03", "Física", "Formar alunos");
        
        System.out.println("--------------------------------------------------");
        
        Professor p1 = new Professor();
        p1.informarDados("201006977", "Cristiane", "087.984.654-98", "Nem sei o que é", "cris@gmail.com", c1);
        Professor p2 = new Professor();
        p2.informarDados("201864689", "Glauco", "078.965.567-74", "...", "glauc@gmail.com", c3);
        Professor p3 = new Professor();
        p3.informarDados("201864689", "Chico", "078.965.567-74", "...", "Chiquinho@gmail.com", c2);
        c1.definirCoordenador(p2);
        c1.addDoscentes(p1);
        c1.addDoscentes(p3);
        c1.imprimirDados();
        
        System.out.println("--------------------------------------------------");
        
        Aluno a1 = new Aluno();
        a1.informarDados("2018006797", "Wellington", "076.597.458-97", "wellington@gmail.com");
        a1.matricular(c1);
        a1.imprimirDados();
        System.out.println();
        Aluno a2 = new Aluno();
        a2.informarDados("2018945321", "Ubira", "076.597.495-04", "Bira@gmail.com");
        a2.matricular(c2);
        a2.imprimirDados();
        System.out.println();
        Aluno a3 = new Aluno();
        a3.informarDados("2018945321", "Santana", "037.659.495-13", "Sant@gmail.com");
        a3.matricular(c3);
        a3.imprimirDados();       
    }
}
