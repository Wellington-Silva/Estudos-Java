package ifs.padrões_de_projeto.Factorys;

import ifs.padrões_de_projeto.Docente;
import ifs.padrões_de_projeto.Medico;
import ifs.padrões_de_projeto.Medicos;
import ifs.padrões_de_projeto.Prototype.Prototype;
import ifs.padrões_de_projeto.Residente;

public class FactoryMedicos implements Prototype {
     public static Medicos criarMedico(String emissor) throws Exception {

         if (emissor.equalsIgnoreCase("Residente")) {
             System.out.println("-----");
             System.out.println("Residente criado!");
             System.out.println("-----");
             return new Residente();
         } else if (emissor.equalsIgnoreCase("Docente")) {
             System.out.println("-----");
             System.out.println("Docente criado!");
             System.out.println("-----");
             return new Docente();
         } else if (emissor.equalsIgnoreCase("Medico")){
             System.out.println("-----");
             System.out.println("Medico criado!");
             System.out.println("-----");
             return new Medico();
         }
         throw new Exception("Médico inválido!");
     }

    @Override
    public Prototype clone() { return null; }
}

