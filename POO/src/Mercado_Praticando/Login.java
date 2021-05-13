package Mercado_Praticando;
public class Login extends User{
    private  String user = "mercadosaojose";
    private  String passWord = "msj1";

    public Login(String nome, double preço, String nome1, String user, String senha, String user1, String passWord) {
        super(nome, preço, nome1, user, senha);
        this.user = user1;
        this.passWord = passWord;
    }

    public void validarUser() {
        if(this.user != getUser()) {
            System.out.println("Usuário inválido! \nTente Novamente!");
        } else {
            System.out.println("Bem-vindo " + getNome());
        }
    }

    public void validarSenha() {
        if(this.passWord != getSenha()) {
            System.out.println("Usuário inválido! \nTente Novamente!");
        } else {
            System.out.println("Bem-vindo!");
        }
    }
}
