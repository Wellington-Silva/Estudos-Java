package aluno;
public class classAluno {
    private String nome;
    private String matricula;
    private String curso;
    private String nomesDisciplinas[] = new String[3];
    private double notasDisciplina[][] = new double[3][4];

    public classAluno() {
    }

    public classAluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }

    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }

    public double[][] getNotasDisciplina() {
        return notasDisciplina;
    }
    
    public void setNotasDisciplina(double[][] notasDisciplina) {
        this.notasDisciplina = notasDisciplina;
    }
    
    public void mostrarInfo() {
        System.out.println("-----------------------------------");
        
        System.out.println("Nome: "+ nome);
        System.out.println("Matrícula: "+ matricula);
        System.out.println("Curso: "+ curso);
        
        System.out.println("-----------------------------------");
        
        for(int i=0; i<notasDisciplina.length; i++){
            System.out.println("Notas da disciplina "+nomesDisciplinas[i]);
            for(int j=0; j<notasDisciplina.length; j++){
                System.out.println(notasDisciplina[i][j] + " ");
            }
            System.out.println();
        }    
    }
    
    public boolean aprovado(int indice) {
        
        double soma = 0;
        
        for(int i=0; i<notasDisciplina[indice].length; i++) {
            soma += notasDisciplina[indice][i];
        }
        
        double media = soma / 4;
        
        if(media >= 7) {
            return true;
        } else {
            return false;
        }
    }
}
