package FPolimorfismo.ex1.dominio;

public class Cat extends Animal{

    public Cat(String tempoVida) {
        super(tempoVida, true);
    }

    public void sound() {
        System.out.println("Miau");
    }
}
