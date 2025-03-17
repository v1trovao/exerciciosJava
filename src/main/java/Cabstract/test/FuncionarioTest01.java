package Cabstract.test;

import Cabstract.dominio.Desenvolvedor;
import Cabstract.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente ger1 = new Gerente("Jadice", "01", 2500, "Contabilidade");
        Desenvolvedor dev1 = new Desenvolvedor("Venn", "02", 1600, "Java");

        ger1.imprimeDados();
        dev1.imprimeDados();
    }
}
