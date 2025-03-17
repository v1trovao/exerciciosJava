package Cabstract.dominio;

import Aheranca.dominio.Setor;

public abstract class Funcionario {

    protected String nome;
    protected String matricula;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String matricula, String cargo, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        calcularSalario();
    }

    @Override
    public String toString() {

        return this.matricula + " - " + this.nome + ", " + this.cargo
                 + ", " + "Salario Atual: R$"+this.salario;
    }

    public abstract void calcularSalario();

    public abstract void imprimeDados();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
