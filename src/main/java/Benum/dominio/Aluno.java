package Benum.dominio;

public class Aluno {
    private String nome;
    private InstrumentoMusical instrumento;

    public Aluno(String nome, InstrumentoMusical instrumento) {
        this.nome = nome;
        this.instrumento = instrumento;
    }

    public void showInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Instrumento: " + instrumento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public InstrumentoMusical getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(InstrumentoMusical instrumento) {
        this.instrumento = instrumento;
    }
}
