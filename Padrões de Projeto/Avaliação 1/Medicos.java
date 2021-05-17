package ifs.padrões_de_projeto;

import ifs.padrões_de_projeto.Prototype.Paciente;

public interface Medicos {
    public void emitirPedidoExame(Paciente registro, int aux, String data, String hipotese);
}
