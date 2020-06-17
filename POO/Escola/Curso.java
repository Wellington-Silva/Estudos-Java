package Escola;
public class Curso {
    public String codigo;
    public String nome;
    public String descricao;
    Professor coordenador;
    public Professor[] docentes = new Professor[5];
    
    public void informarDados(String pCodigo, String pNome, String pDescricao) {
        this.nome = pNome;
        this.codigo = pCodigo;
        this.descricao = pDescricao;
    }
    
    public void definirCoordenador(Professor pCoordenador) {
        this.coordenador = pCoordenador;
    }
    
    public boolean addDoscentes(Professor pProfessor) {
        boolean flag=false;
        for(int i=0; i<docentes.length; i++){
            if(docentes[i] != null){
                docentes[i] = pProfessor;
                flag=true;
                break;
            }
        }
        return flag;
    }
    
    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        for(int i=0; i<docentes.length; i++){
            if(docentes[i] != null){
                System.out.print(docentes[i] + " ");               
            }
        }    
    }        
}
