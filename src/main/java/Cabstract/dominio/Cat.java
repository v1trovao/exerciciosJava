package Cabstract.dominio;

public class Cat extends Animal {

    public Cat(String nome) {
        super(nome);
    }
    @Override
    public void sound() {
        System.out.println("I'm " + this.nome + " cat! Meow!");
    }
}
