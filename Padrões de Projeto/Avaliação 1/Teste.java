package ifs.padrões_de_projeto;

import ifs.padrões_de_projeto.Factorys.*;
import ifs.padrões_de_projeto.Prototype.Paciente;
import ifs.padrões_de_projeto.Prototype.Prototype;

public class Teste {
    public static void main(String[] args) throws Exception {
        Paciente paciente = new Paciente("João", 'M', "Branco");
        paciente.calcularIdade(1999);

        Prototype p1 = paciente.clone(); //teste prototype

        Medicos resid = FactoryMedicos.criarMedico("Residente"); //teste factory
        resid.emitirPedidoExame(paciente, 2, "21/02/2021", "Monitorar batimentos");

        System.out.println();
        System.out.println(p1); //verificando se clonou
        System.out.println();

        Residente residente = (Residente) resid; //implementando as outras classes
        residente.setNome("Owen Hunt");
        residente.setCrm(2334);

        residente.registrarExame("22/02/2021", "14:00");
        residente.emitirLaudo(residente, "Laudo foi emitido!");

        Medicos doc = FactoryMedicos.criarMedico("Docente"); //criando docente
        Docente docente = (Docente) doc;
        docente.setNome("Maria");

        docente.revisarLaudo(residente, "Laudo foi emitido!");
        System.out.println();

        Medico medico = (Medico) docente.clone(); //medico clona a criação do Docente;

        medico.consultarLaudos(p1);
    }
}
