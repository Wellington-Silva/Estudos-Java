package ifs.padrões_de_projeto;

import ifs.padrões_de_projeto.Prototype.Paciente;
import ifs.padrões_de_projeto.Prototype.Prototype;
import ifs.padrões_de_projeto.Singleton.PDFArquivo;

public class Residente extends Medico implements Prototype {
    private String nome;
    private int crm;
    private int anoResidencia;
    private String nomeExame = " ";
    private String data;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCrm() {
        return crm;
    }

    @Override
    public void setCrm(int crm) {
        this.crm = crm;
    }

    public int getAnoResidencia() {
        return anoResidencia;
    }

    public void setAnoResidencia(int anoResidencia) {
        this.anoResidencia = anoResidencia;
    }

    @Override
    public String getNomeExame() {
        return nomeExame;
    }

    @Override
    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    public void registrarExame(String data, String hora) {
        System.out.println("Exame realizado às " + hora + " no dia " + data);
        PDFArquivo.getInstance();
        System.out.println();
    }

    public boolean emitirLaudo(Residente residente, String descricao) {
        System.out.println("Emissão de Laudo feito por: " + residente.getNome());
        System.out.println("Descrição: " + descricao);
        return true;
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

    @Override
    public Prototype clone() {
        setNome(nome);
        setCrm(crm);
        setAnoResidencia(anoResidencia);
        return new Residente();
    }
}
