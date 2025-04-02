package FPolimorfismo.ex1.test;

import FPolimorfismo.ex1.dominio.Animal;
import FPolimorfismo.ex1.dominio.Bird;
import FPolimorfismo.ex1.dominio.Cat;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal a1 = new Bird("6");
        Animal a2 = new Cat("9");
        a1.sound();
        a2.sound();

        System.out.println(a1.getTempoVida());
        System.out.println(a2.getTempoVida());

        a1.isDomestico();

        a2.isDomestico();
    }
}
