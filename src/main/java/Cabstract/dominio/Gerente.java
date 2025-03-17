package Cabstract.dominio;

public class Gerente extends Funcionario {

    private static final double bonusSalario = 250.0;
    private String setor;

    public Gerente(String nome, String matricula, double salario, String setor) {

        super(nome, matricula, "Gerente", salario);
        this.setor = setor;
    }

    @Override
    public void calcularSalario() {
        this.salario += bonusSalario;
    }

    @Override
    public void imprimeDados() {
        System.out.println(this);
        System.out.println(" Bonus de salário: R$" + bonusSalario);
        System.out.println(" Setor: " + setor);
    }
}
