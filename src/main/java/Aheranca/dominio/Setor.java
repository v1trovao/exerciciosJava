package Aheranca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Setor {
    private String nome;
    private String descricao;
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    public Setor(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    @Override
    public String toString() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        funcionario.setSetor(this);
    }

    public void definirGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
