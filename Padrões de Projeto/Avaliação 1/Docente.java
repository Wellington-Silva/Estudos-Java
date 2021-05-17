package ifs.padrões_de_projeto;

import ifs.padrões_de_projeto.Prototype.Paciente;
import ifs.padrões_de_projeto.Prototype.Prototype;
import ifs.padrões_de_projeto.Singleton.PDFArquivo;

public class Docente extends Medico implements Prototype {
    private String nome;
    private int crm;
    private String titulacao;
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

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
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

    public void revisarLaudo(Residente residente, String descricao) {
        if (residente.emitirLaudo(residente, descricao)){
            System.out.println("Laudo do Residente " + residente.getNome() + " Revisado pelo(a) docente: " + getNome());
            System.out.println("Laudo definitivo!");
            PDFArquivo.getInstance();
        }
    }
    @Override
    public void emitirPedidoExame(Paciente registro, int aux, String data, String hipotese) {
        switch (aux) {
            case 0 -> nomeExame = "Eletrocardiograma";
            case 1 -> nomeExame = "Ecocardiograma";
            case 2 -> nomeExame = "Holter";
            case 3 -> nomeExame = "MAPA";
            default -> nomeExame = null;
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
        setTitulacao(titulacao);
        return new Docente();
    }
}
