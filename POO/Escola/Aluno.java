package Escola;
public class Aluno {
    public String matricula;
    public String nome;
    public String cpf;
    public String email;
    public Curso curso[] = new Curso[3];
    
    public void informarDados(String pMatricula, String pNome, String pCpf, String pEmail) {
        this.matricula = pMatricula;
        this.cpf = pCpf;
        this.email = pEmail;
        this.nome = pNome;
    }
    
    public boolean matricular(Curso pCurso) {
        boolean matric=false;
        for(int i=0; i<curso.length; i++){
            if(curso[i] != null){
                curso[i] =  pCurso;
                matric = true;
                break;
            }
        }
        return matric;
    }
    
    public void imprimirDados() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
        for(int i=0; i<curso.length; i++) {
            if(curso[i] != null){
                System.out.print(curso[i] + " ");
            }    
        }
    }
}
