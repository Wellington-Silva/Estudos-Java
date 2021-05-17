package ifs.padrões_de_projeto;

import ifs.padrões_de_projeto.Prototype.Paciente;
import ifs.padrões_de_projeto.Prototype.Prototype;
import ifs.padrões_de_projeto.Prototype.Paciente;
import java.util.Date;

public class Medico implements Medicos {
    private String nome;
    private int crm;
    private String nomeExame = " ";
    private String data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //método usando clone de Paciente na classe Principal
    public void consultarLaudos(Prototype paciente){
        System.out.println("Lista de Laudos do paciente: ");
        System.out.println(paciente);
        System.out.println("Consultada!");
    }

    @Override
    public void emitirPedidoExame(Paciente registro, int aux, String data, String hipotese) {
        switch (aux) {
            case 0:
                nomeExame = "Eletrocardiograma";
                break;
            case 1:
                nomeExame = "Ecocardiograma";
                break;
            case 2:
                nomeExame = "Holter";
                break;
            case 3:
                nomeExame = "MAPA";
                break;
            default:
                nomeExame = null;
        }
        this.data = data;

        System.out.println("Paciente: \n" + registro);
        System.out.println("Exame: " + nomeExame);
        System.out.println("Data prevista para realização: " + this.data);
        System.out.println("Hipótese: " + hipotese);
    }
}
