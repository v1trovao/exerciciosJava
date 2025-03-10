package Aheranca.dominio;

public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, String matricula, String linguagem) {
        super(nome, matricula, "Desenvolvedor");
        this.linguagem = linguagem;
    }

    @Override
    public void exibirDados() {
        System.out.println(this);
        System.out.println(" Linguagem: " + this.linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
