package Aheranca.test;

import Aheranca.dominio.Desenvolvedor;
import Aheranca.dominio.Gerente;
import Aheranca.dominio.Setor;

public class EmpresaTest01 {
    public static void main(String[] args) {
        Gerente ger1 = new Gerente("Jadice", "001");
        Desenvolvedor dev1 = new Desenvolvedor("Rey", "002", "Java");
        Setor setor1 = new Setor("TI", "Tecnologia da Informação");

        setor1.adicionarFuncionario(ger1);
        setor1.adicionarFuncionario(dev1);

        System.out.println("Funcionarios: ");
        ger1.exibirDados();
        dev1.exibirDados();
    }
}
