package Cabstract.dominio;

public class Pig extends Animal {

    public Pig(String nome) {
        super(nome);
    }

    @Override
    public void sound() {
        System.out.println("I'm " + this.nome + " pig! Oink!");
    }
}
