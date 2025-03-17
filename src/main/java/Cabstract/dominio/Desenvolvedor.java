package Cabstract.dominio;

public class Desenvolvedor extends Funcionario {

    private String linguagem;
    private double bonus;

    public Desenvolvedor(String nome, String matricula, double salario, String linguagem) {
        super(nome, matricula, "Desenvolvedor", salario);
        this.linguagem = linguagem;
    }

    @Override
    public void calcularSalario() {
        this.bonus = salario * 0.1;
        this.salario = salario + this.bonus;
    }

    @Override
    public void imprimeDados() {
        System.out.println(this);
        System.out.println(" Bonus de salário: R$" + this.bonus);
        System.out.println(" Linguagem: " + this.linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
