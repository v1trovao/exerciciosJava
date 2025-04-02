package FPolimorfismo.ex1.dominio;

public class Bird extends Animal {

    public Bird(String tempoVida) {
        super(tempoVida, false);
    }

    public void sound() {
        System.out.println("Bird sound");
    }
}
