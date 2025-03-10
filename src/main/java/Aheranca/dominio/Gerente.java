package Aheranca.dominio;

public class Gerente extends Funcionario {

    private static double bonusSalario = 250.0;

    public Gerente(String nome, String matricula) {
        super(nome, matricula, "Gerente");
    }

    public void exibirDados() {
        System.out.println(this);
        System.out.println(" Salario atual com bônus: R$" + (this.salario+bonusSalario));
    }
}
