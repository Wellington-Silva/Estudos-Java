package Banco;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cliente clt1 = new Cliente();
        clt1.informarDados("078.965.412-92", "Wellington", "1.568.156-9", "Lagarto/SE");
        clt1.imprimirDados();
        
        Cliente clt2 = new Cliente();
        clt1.informarDados("073.695.912-22", "Vinícius", "3.598.456-8", "Salgado/SE");
        clt1.imprimirDados();
        
        Cliente clt3 = new Cliente();
        clt1.informarDados("079.554.112-96", "Andrea", "4.569.874-1", "Aracaju/SE");
        clt1.imprimirDados();
        
        Conta c1 = new Conta();
        c1.titular = clt1;
        c1.numero = "056845242";
        c1.agencia = "015";
        c1.dataAbertura = "01/01/2020";   
        c1.saldo = 1000;
        c1.addDependente(clt3);
        c1.recuperarDadosParaImpressao();
        
        Conta c2 = new Conta();
        c2.titular = clt2;
        c2.recuperarDadosParaImpressao();
        
       Conta c3 = new Conta();
       c3.titular = clt3;
       c3.recuperarDadosParaImpressao();

    }
}
