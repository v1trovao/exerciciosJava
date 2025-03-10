package Aheranca.dominio;

public class Funcionario {

    private String nome;
    private String matricula;
    private String cargo;
    private Setor setor = null;
    protected double salario = 0.0;

    public Funcionario(String nome, String matricula, String cargo) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    @Override
    public String toString() {

        return this.matricula + " - " + this.nome + ", " + this.cargo
                + " \n Setor: " + this.setor + ", " + "Salario Atual: R$"+this.salario;
    }

    public void exibirDados() {
        System.out.println("Dados do Funcionário");
        System.out.println(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
